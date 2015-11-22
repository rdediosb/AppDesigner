/**
 */
package containers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link containers.PortMapping#getExternal <em>External</em>}</li>
 *   <li>{@link containers.PortMapping#getInternal <em>Internal</em>}</li>
 * </ul>
 *
 * @see containers.ContainersPackage#getPortMapping()
 * @model
 * @generated
 */
public interface PortMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(int)
	 * @see containers.ContainersPackage#getPortMapping_External()
	 * @model
	 * @generated
	 */
	int getExternal();

	/**
	 * Sets the value of the '{@link containers.PortMapping#getExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #getExternal()
	 * @generated
	 */
	void setExternal(int value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(int)
	 * @see containers.ContainersPackage#getPortMapping_Internal()
	 * @model
	 * @generated
	 */
	int getInternal();

	/**
	 * Sets the value of the '{@link containers.PortMapping#getInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #getInternal()
	 * @generated
	 */
	void setInternal(int value);

} // PortMapping
