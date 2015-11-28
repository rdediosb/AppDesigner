/**
 */
package containers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link containers.Image#getImageID <em>Image ID</em>}</li>
 * </ul>
 *
 * @see containers.ContainersPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Image ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image ID</em>' attribute.
	 * @see #setImageID(String)
	 * @see containers.ContainersPackage#getImage_ImageID()
	 * @model
	 * @generated
	 */
	String getImageID();

	/**
	 * Sets the value of the '{@link containers.Image#getImageID <em>Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image ID</em>' attribute.
	 * @see #getImageID()
	 * @generated
	 */
	void setImageID(String value);

} // Image
