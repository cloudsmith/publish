package com.cloudsmith.publish.ui.commands;

import java.io.PrintStream;
import java.util.List;

import org.eclipse.b3.backend.core.B3BackendException;
import org.eclipse.b3.backend.core.IResultStatus;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;
import org.eclipse.b3.beelang.ui.BeeLangConsoleUtils;
import org.eclipse.b3.build.BeeModel;
import org.eclipse.b3.build.core.B3BuildEngine;
import org.eclipse.b3.build.operations.RunFunctionInModelOperation;
import org.eclipse.b3.provisional.core.BuildException;
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


@Deprecated
public class ExecuteHandler extends AbstractHandler {

//	@Override
	@SuppressWarnings("unchecked")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final MessageConsole b3Console = BeeLangConsoleUtils.getBeeLangConsole();
		PrintStream b3out = BeeLangConsoleUtils.getConsoleOutputStream(b3Console);
		PrintStream b3err = BeeLangConsoleUtils.getConsoleErrorStream(b3Console);

		try {
			b3out.println("b3: Running function main()...");
						
			EvaluationContext ctx = (EvaluationContext) event.getApplicationContext();
			List<ContentOutlineNode> nodes = (List<ContentOutlineNode>) ctx.getDefaultVariable();
			ContentOutlineNode node = nodes.get(0);
			
			IStatus result = node.getEObjectHandle().readOnly(new IUnitOfWork<IStatus, EObject>() {
//				@Override
				public IStatus exec(EObject state) throws Exception {
					return new B3BuildEngine().run(new RunFunctionInModelOperation((BeeModel)state));
				}});
			
			if(result.isOK()) {
				b3out.print("b3: ok ");
				if(result instanceof IResultStatus) {
					b3out.print("result=> ");
					b3out.print(((IResultStatus)result).getResult());
				}
				b3out.print("\n");
				return null; // specified by handler API.
			}
			if(result.matches(IStatus.CANCEL)) {
				// operation was cancelled, possibly because of an error, or interuption
				// can also be a multi status with more detail... for now just print 'canceled'.
				b3out.print("canceled.");
				return null;
			}
			
			// Only error and warning remain
			Throwable e = result.getException();

			// Useful when debugging
			BuildException.deeplyPrint(e, System.err, true);

			// Simple error reporting
			b3err.println("b3 error: " + result.getMessage());
			if(e == null) {
				return null;
			}
			if(e instanceof B3BackendException) {
					B3BackendException exprException = (B3BackendException)e;
					BExpression expr = exprException.getExpression();
					int lineNumber = BeeLangUtils.getLineNumber(expr);

					b3err.println(exprException.getMessage());
					b3err.println("        at " + BeeLangUtils.closestNamedElement(expr) + "(" +
						exprException.getLocationString() + ":" + lineNumber + ").");
					
					}
				
			BuildException.deeplyPrint(e, b3err, false);
		}
		finally {
			b3err.close();
			b3out.close();
		}
		return null; // dictated by Handler API
	}
}
