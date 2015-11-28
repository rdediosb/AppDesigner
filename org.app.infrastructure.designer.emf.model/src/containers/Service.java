/**
 */
package containers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link containers.Service#getLink <em>Link</em>}</li>
 *   <li>{@link containers.Service#getImage <em>Image</em>}</li>
 *   <li>{@link containers.Service#getHost_port <em>Host port</em>}</li>
 *   <li>{@link containers.Service#getContainer_port <em>Container port</em>}</li>
 * </ul>
 *
 * @see containers.ContainersPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(Service)
	 * @see containers.ContainersPackage#getService_Link()
	 * @model
	 * @generated
	 */
	Service getLink();

	/**
	 * Sets the value of the '{@link containers.Service#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Service value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(Image)
	 * @see containers.ContainersPackage#getService_Image()
	 * @model
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link containers.Service#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

	/**
	 * Returns the value of the '<em><b>Host port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host port</em>' attribute.
	 * @see #setHost_port(int)
	 * @see containers.ContainersPackage#getService_Host_port()
	 * @model
	 * @generated
	 */
	int getHost_port();

	/**
	 * Sets the value of the '{@link containers.Service#getHost_port <em>Host port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host port</em>' attribute.
	 * @see #getHost_port()
	 * @generated
	 */
	void setHost_port(int value);

	/**
	 * Returns the value of the '<em><b>Container port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container port</em>' attribute.
	 * @see #setContainer_port(int)
	 * @see containers.ContainersPackage#getService_Container_port()
	 * @model
	 * @generated
	 */
	int getContainer_port();

	/**
	 * Sets the value of the '{@link containers.Service#getContainer_port <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container port</em>' attribute.
	 * @see #getContainer_port()
	 * @generated
	 */
	void setContainer_port(int value);

} // Service
