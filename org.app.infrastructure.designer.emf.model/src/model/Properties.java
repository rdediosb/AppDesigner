/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Properties#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getProperties()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link model.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see model.ModelPackage#getProperties_Properties()
	 * @model containment="true"
	 *        extendedMetaData="name='property' kind='element'"
	 * @generated
	 */
	EList<Property> getProperties();

} // Properties
