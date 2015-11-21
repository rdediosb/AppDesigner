/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelReference#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelReference()
 * @model
 * @generated
 */
public interface DiagramModelReference extends DiagramModelObject {
	/**
	 * Returns the value of the '<em><b>Referenced Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Model</em>' reference.
	 * @see #setReferencedModel(DiagramModel)
	 * @see model.ModelPackage#getDiagramModelReference_ReferencedModel()
	 * @model resolveProxies="false"
	 *        extendedMetaData="name='model' kind='attribute'"
	 * @generated
	 */
	DiagramModel getReferencedModel();

	/**
	 * Sets the value of the '{@link model.DiagramModelReference#getReferencedModel <em>Referenced Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Model</em>' reference.
	 * @see #getReferencedModel()
	 * @generated
	 */
	void setReferencedModel(DiagramModel value);

} // DiagramModelReference
