/**
 */
package containers;

import org.eclipse.emf.common.util.EMap;


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
 *   <li>{@link containers.Service#getHost_port <em>Host port</em>}</li>
 *   <li>{@link containers.Service#getContainer_port <em>Container port</em>}</li>
 *   <li>{@link containers.Service#getImage <em>Image</em>}</li>
 *   <li>{@link containers.Service#getApp <em>App</em>}</li>
 *   <li>{@link containers.Service#getEnvs <em>Envs</em>}</li>
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
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see containers.ContainersPackage#getService_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link containers.Service#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(Application)
	 * @see containers.ContainersPackage#getService_App()
	 * @model
	 * @generated
	 */
	Application getApp();

	/**
	 * Sets the value of the '{@link containers.Service#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(Application value);

	/**
	 * Returns the value of the '<em><b>Envs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envs</em>' map.
	 * @see containers.ContainersPackage#getService_Envs()
	 * @model mapType="containers.ENKV<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getEnvs();

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
