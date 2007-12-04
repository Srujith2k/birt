/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.engine.api;

/**
 * Defines render options for emitters
 */
public class PDFRenderOption extends RenderOption implements IPDFRenderOption
{

	/**
	 * dummy constructor
	 */
	public PDFRenderOption( )
	{
		super( );
	}

	public PDFRenderOption( IRenderOption options )
	{
		super( options );
	}

	public void setEmbededFont( boolean isEmbededFont )
	{
		setOption( IS_EMBEDDED_FONT, new Boolean( isEmbededFont ) );
	}

	/**
	 * 
	 * @return true if font is embedded
	 */
	public boolean isEmbededFont( )
	{
		return getBooleanOption( IS_EMBEDDED_FONT, false );
	}

	/**
	 * 
	 * @return the user-defined font directory
	 */
	public String getFontDirectory( )
	{
		return getStringOption( FONT_DIRECTORY );
	}

	/**
	 * 
	 * @param fontDirectory
	 *            the user-defined font directory
	 */
	public void setFontDirectory( String fontDirectory )
	{
		setOption( FONT_DIRECTORY, fontDirectory );
	}
}
