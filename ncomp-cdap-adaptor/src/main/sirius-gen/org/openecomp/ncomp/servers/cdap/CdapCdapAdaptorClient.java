
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
// Autogenerated
// Do not edit. No need to extend this class.
package org.openecomp.ncomp.servers.cdap;

import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient;
import org.openecomp.ncomp.sirius.manager.GenericHttpClient;

import org.apache.log4j.Logger;

import org.openecomp.logger.EcompLogger;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.logger.EcompException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openecomp.ncomp.cdap.impl.CdapAdaptorImpl;
import org.openecomp.ncomp.cdap.CdapPackage;
import org.openecomp.ncomp.servers.cdap.logging.CdapAdaptorOperationEnum;
import org.openecomp.ncomp.servers.cdap.logging.CdapAdaptorMessageEnum;





 
@SuppressWarnings("unchecked")
public class CdapCdapAdaptorClient extends CdapAdaptorImpl {
	public static final Logger logger = Logger.getLogger(CdapCdapAdaptorClient.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	public AbstractClient client;

	public CdapCdapAdaptorClient(String file, String name) {
		CdapCdapAdaptor.ecoreSetup(); 
		client = new GenericHttpClient(file,name);
		client.add("/resources", this);
		client.setVersion("ONAP-R2");
	}

	public CdapCdapAdaptorClient(String file, String name1, String name2) {
		HighAvailabilityClient client1 = new HighAvailabilityClient(file,name1,name2);
		client = client1.all; // requests should be forwarded to all.
		client.add("/resources", this);
		client.setVersion("ONAP-R2");
	}
	
	public CdapCdapAdaptorClient(AbstractClient c) {
		client = c;
		client.add("/resources", this);
		client.setVersion("ONAP-R2");
	}



}
