/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Archimate Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelArchimateConnection#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelArchimateConnection()
 * @model extendedMetaData="name='Connection'"
 * @generated
 */
public interface DiagramModelArchimateConnection extends DiagramModelConnection {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(Relationship)
	 * @see model.ModelPackage#getDiagramModelArchimateConnection_Relationship()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	Relationship getRelationship();

	/**
	 * Sets the value of the '{@link model.DiagramModelArchimateConnection#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Relationship value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRelationshipToModel(Folder parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRelationshipFromModel();

} // DiagramModelArchimateConnection
