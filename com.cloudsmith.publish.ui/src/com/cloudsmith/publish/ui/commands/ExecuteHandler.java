package com.cloudsmith.publish.ui.commands;

import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.backend.evaluator.b3backend.IFunction;
import org.eclipse.b3.beelang.ui.BeeLangConsoleUtils;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildConstants;
import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.core.SharedScope;
import org.eclipse.b3.utils.BeeLangUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.EvaluationContext;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;


public class ExecuteHandler extends AbstractHandler {
	private boolean performResolve;

	@Override
	@SuppressWarnings("unchecked")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final MessageConsole b3Console = BeeLangConsoleUtils.getBeeLangConsole();
		PrintStream b3ConsoleOutputStream = BeeLangConsoleUtils.getConsoleOutputStream(b3Console);
		try {
			b3ConsoleOutputStream.println("Running the main function...");
			EvaluationContext ctx = (EvaluationContext) event.getApplicationContext();
			List<ContentOutlineNode> nodes = (List<ContentOutlineNode>) ctx.getDefaultVariable();
			ContentOutlineNode node = nodes.get(0);
			Object result = node.getEObjectHandle().readOnly(new IUnitOfWork<Object, EObject>() {
				@Override
				public Object exec(EObject state) throws Exception {
					B3BuildEngine engine = new B3BuildEngine();
					try {
						engine.defineBeeModel((BeeModel) state);
					}
					catch(Throwable e) {
						PrintStream b3ConsoleErrorStream = BeeLangConsoleUtils.getConsoleErrorStream(b3Console);
						try {
							e.printStackTrace();
							b3ConsoleErrorStream.println("Loading failed with error: " +
									e.getClass().getName().toString() + " : " + e.getMessage());
							if(e.getCause() != null) {
								b3ConsoleErrorStream.println("Caused by: " + e.getCause().getMessage());
								return null;
							}

						}
						finally {
							b3ConsoleErrorStream.close();
						}

					}
					// get the resolution scope (in case a resolution is to be performed)
					//
					SharedScope resolutionScope = null;
					// If resolving, run a resolution
					if(isPerformResolve()) {
						resolutionScope = engine.getInjector().getInstance(B3BuildConstants.KEY_RESOLUTION_SCOPE);
						resolutionScope.enter(); // !remember to call exit()

						IStatus status = engine.resolveAllUnits();
						if(!status.isOK()) {
							PrintStream b3ConsoleErrorStream = BeeLangConsoleUtils.getConsoleErrorStream(b3Console);
							try {
								// TODO: Better error reporting on failed resolution
								b3ConsoleErrorStream.println("Resolution Failed with non OK status :");
								b3ConsoleErrorStream.println(status.toString());

							}
							finally {
								b3ConsoleErrorStream.close();
								// if(resolutionScope != null) // in case the error has to do with resolution scope
								// resolutionScope.exit();
								// resolutionScope = null;
							}

						}
					}
					// find a function called main (use the first found) and call it with a List<Object> argv
					IFunction main = null;
					for(IFunction f : ((BeeModel) state).getFunctions()) {
						if("main".equals(f.getName())) {
							main = f;
						}
					}

					if(main == null)
						return null;
					final List<Object> argv = new ArrayList<Object>();
					argv.add(engine);
					try {
						return engine.callFunction(
							"main", new Object[] { argv }, new Type[] { List.class });
					}
					catch(B3BackendException exprException) {
						exprException.printStackTrace();
						BExpression expr = exprException.getExpression();
						int lineNumber = BeeLangUtils.getLineNumber(expr);

						PrintStream b3ConsoleErrorStream = BeeLangConsoleUtils.getConsoleErrorStream(b3Console);
						try {
							b3ConsoleErrorStream.println(exprException.getMessage());
							b3ConsoleErrorStream.println("        at " + BeeLangUtils.closestNamedElement(expr) + "(" +
									exprException.getLocationString() + ":" + lineNumber + ").");
							if(exprException.getCause() != null) {
								b3ConsoleErrorStream.println("Caused by: " +
										((exprException.getCause().getMessage() == null)
												? exprException.getCause().getClass().getName()
												: exprException.getCause().getMessage()));
							}

						}
						finally {
							b3ConsoleErrorStream.close();
						}

					}
					catch(Throwable e) {
						// Just print some errors
						e.printStackTrace();
						PrintStream b3ConsoleErrorStream = BeeLangConsoleUtils.getConsoleErrorStream(b3Console);
						try {
							b3ConsoleErrorStream.println(e.getMessage());
						}
						finally {
							b3ConsoleErrorStream.close();
						}
					}
					finally {
						if(resolutionScope != null)
							resolutionScope.exit();
						resolutionScope = null;
					}
					return null;
				}
			});
			b3ConsoleOutputStream.println("Result = " + (result == null
					? "null"
					: result.toString()));
			return null;
		}
		finally {
			b3ConsoleOutputStream.close();
		}
	}

	public boolean isPerformResolve() {
		return performResolve;
	}

	public void setPerformResolve(boolean performResolve) {
		this.performResolve = performResolve;
	}
}
