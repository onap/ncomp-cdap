
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
	
/**
 */
package org.openecomp.ncomp.cdap;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapDataset#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapDataset#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapDataset#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapDataset()
 * @model
 * @generated
 */
public interface CdapDataset extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapDataset_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapDataset#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapDataset_Properties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapKeyPair> getProperties();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(CdapDatasetSchema)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapDataset_Schema()
	 * @model containment="true"
	 * @generated
	 */
	CdapDatasetSchema getSchema();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapDataset#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(CdapDatasetSchema value);

} // CdapDataset
