/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link model.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends ArchimateComponent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ArchimateElement)
	 * @see model.ModelPackage#getRelationship_Source()
	 * @model resolveProxies="false"
	 * @generated
	 */
	ArchimateElement getSource();

	/**
	 * Sets the value of the '{@link model.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ArchimateElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ArchimateElement)
	 * @see model.ModelPackage#getRelationship_Target()
	 * @model resolveProxies="false"
	 * @generated
	 */
	ArchimateElement getTarget();

	/**
	 * Sets the value of the '{@link model.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ArchimateElement value);

} // Relationship
