<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text" />

	<xsl:param name="product-iu" />

	<xsl:template match="/">
		<xsl:for-each select="(/repository/units/unit[@id = $product-iu])/@version">
			<xsl:if test="position() = 1">
				<xsl:value-of select="." />
			</xsl:if>
		</xsl:for-each>
	</xsl:template>
</xsl:transform>
