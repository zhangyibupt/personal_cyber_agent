/**
 * PCA Monitoring
 *
 * Copyright (C) 2010 by Networld Project
 * Written by Alex Oberhauser <oberhauseralex@networld.to>
 * All Rights Reserved
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this software.  If not, see <http://www.gnu.org/licenses/>
 */

package to.networld.cyberagent.monitoring;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Logging on the base of log4j for the whole pca.
 * 
 * @author Alex Oberhauser
 */
public abstract class Logging {

	private static final String LOG_CONFIG = Logging.class.getResource("log4j.properties").getPath();
	
	public static Logger getLogger() {
		Logger log = Logger.getLogger("monitoring");
		File fd = new File(LOG_CONFIG);
		if ( fd.exists() )
			PropertyConfigurator.configure(LOG_CONFIG);
		return log;
	}
}