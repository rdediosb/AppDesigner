/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Archimate Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelArchimateObject#getArchimateElement <em>Archimate Element</em>}</li>
 *   <li>{@link model.DiagramModelArchimateObject#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelArchimateObject()
 * @model extendedMetaData="name='DiagramObject'"
 * @generated
 */
public interface DiagramModelArchimateObject extends DiagramModelObject, DiagramModelContainer {
	/**
	 * Returns the value of the '<em><b>Archimate Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archimate Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archimate Element</em>' reference.
	 * @see #setArchimateElement(ArchimateElement)
	 * @see model.ModelPackage#getDiagramModelArchimateObject_ArchimateElement()
	 * @model resolveProxies="false" volatile="true"
	 * @generated
	 */
	ArchimateElement getArchimateElement();

	/**
	 * Sets the value of the '{@link model.DiagramModelArchimateObject#getArchimateElement <em>Archimate Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archimate Element</em>' reference.
	 * @see #getArchimateElement()
	 * @generated
	 */
	void setArchimateElement(ArchimateElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see model.ModelPackage#getDiagramModelArchimateObject_Type()
	 * @model default="0"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link model.DiagramModelArchimateObject#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addArchimateElementToModel(Folder parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeArchimateElementFromModel();

} // DiagramModelArchimateObject
