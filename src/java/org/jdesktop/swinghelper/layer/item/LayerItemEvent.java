/*
 * Copyright (C) 2006,2007 Alexander Potochkin
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.jdesktop.swinghelper.layer.item;

import java.awt.*;
import java.util.EventObject;

/**
 * <code>LayerItemEvent</code> provides notification of changes
 * to a <code>LayerItem</code>
 * 
 * @see LayerItemListener
 * @see LayerItem
 */
public class LayerItemEvent extends EventObject {

    /**
     * Creates a <code>LayerItemEvent</code> object.
     *
     * @param source the object on which the event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public LayerItemEvent(LayerItem source) {
        super(source);
    }

    /**
     * Returns the object on which the event initially occurred.
     *
     * @return the object on which the event initially occurred.
     */
    public LayerItem getSource() {
        return (LayerItem) super.getSource();
    }
}
