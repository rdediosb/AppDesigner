/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AccessRelationship#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAccessRelationship()
 * @model
 * @generated
 */
public interface AccessRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see #setAccessType(int)
	 * @see model.ModelPackage#getAccessRelationship_AccessType()
	 * @model default="0"
	 * @generated
	 */
	int getAccessType();

	/**
	 * Sets the value of the '{@link model.AccessRelationship#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(int value);

} // AccessRelationship
