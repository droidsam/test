/*
 * This file is part of TDA - Thread Dump Analysis Tool.
 *
 * TDA is free software; you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * TDA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the Lesser GNU General Public License
 * along with TDA; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * $Id: Install.java,v 1.2 2008-04-27 20:32:33 irockel Exp $
 */
package net.java.dev.tda.visualvm;

import net.java.dev.tda.visualvm.logfile.LogfileProvider;
import org.openide.modules.ModuleInstall;

/**
 *
 * @author irockel
 */
public class Install extends ModuleInstall {
    
    @Override
    public void restored() {
        try {
            TDAViewProvider.initialize();
            LogfileProvider.initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}