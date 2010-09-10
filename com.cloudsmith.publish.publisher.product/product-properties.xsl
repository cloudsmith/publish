<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" />

	<xsl:param name="os" />

	<xsl:template match="/">
		<product>
			<xsl:variable name="product-name" select="/product/@name" />
			<xsl:if test="$product-name">
				<name>
					<xsl:value-of select="$product-name" />
				</name>
			</xsl:if>

			<xsl:variable name="product-iu" select="(/product/@uid | /product/@id)[position() = 1]" />
			<xsl:if test="$product-iu">
				<iu>
					<xsl:value-of select="$product-iu" />
				</iu>
			</xsl:if>

			<xsl:variable name="product-version" select="/product/@version" />
			<xsl:if test="$product-version">
				<version>
					<xsl:value-of select="$product-version" />
				</version>
			</xsl:if>

			<xsl:variable name="launcher-name" select="/product/launcher/@name" />
			<xsl:if test="$launcher-name">
				<launcher>
					<name>
						<xsl:value-of select="$launcher-name" />
					</name>
				</launcher>
			</xsl:if>

			<xsl:variable name="launcher-icon" select="(/product/launcher/*[name() = $os])/@icon" />
			<xsl:if test="$launcher-icon">
				<launcher>
					<icon>
						<xsl:value-of select="$launcher-icon" />
					</icon>
				</launcher>
			</xsl:if>
		</product>
	</xsl:template>
</xsl:transform>
