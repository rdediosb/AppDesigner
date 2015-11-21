/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.InterfaceElement#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterfaceElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface InterfaceElement extends ArchimateElement {
	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(int)
	 * @see model.ModelPackage#getInterfaceElement_InterfaceType()
	 * @model default="0"
	 * @generated
	 */
	int getInterfaceType();

	/**
	 * Sets the value of the '{@link model.InterfaceElement#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(int value);

} // InterfaceElement
