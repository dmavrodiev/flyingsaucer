/*
 * {{{ header & license
 * Copyright (c) 2004 Joshua Marinacci
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.table;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.xhtmlrenderer.render.Box;

/**
 * Description of the Class
 *
 * @author   empty
 */
public class RowBox extends Box {

    /** Description of the Field */
    public List cells = new ArrayList();

    /** Description of the Field */
    public Element elem;

    /**
     * Constructor for the RowBox object
     *
     * @param x       PARAM
     * @param y       PARAM
     * @param width   PARAM
     * @param height  PARAM
     */
    public RowBox( int x, int y, int width, int height ) {

        super( x, y, width, height );

    }

}

/*
   $Id$
   $Log$
   Revision 1.2  2004/10/23 13:59:17  pdoubleya
   Re-formatted using JavaStyle tool.
   Cleaned imports to resolve wildcards except for common packages (java.io, java.util, etc).
   Added CVS log comments at bottom.

  */

