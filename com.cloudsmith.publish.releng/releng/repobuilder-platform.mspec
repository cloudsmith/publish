<?xml version="1.0" encoding="UTF-8"?>
<mspec:mspec xmlns:mspec="http://www.eclipse.org/buckminster/MetaData-1.0" name="Repobuilder Platform MSPEC" url="repobuilder.cquery" conflictResolution="UPDATE">
	<mspec:property key="target.ws" value="*"/>
	<mspec:property key="target.os" value="*"/>
	<mspec:property key="target.arch" value="*"/>

	<mspec:property key="resolve.target.platform" value="true"/>

	<mspec:mspecNode filter="(buckminster.source=true)" exclude="true"/>
</mspec:mspec>
