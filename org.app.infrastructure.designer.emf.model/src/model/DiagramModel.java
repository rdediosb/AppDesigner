/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModel#getConnectionRouterType <em>Connection Router Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModel()
 * @model abstract="true"
 * @generated
 */
public interface DiagramModel extends ArchimateModelElement, DiagramModelContainer, Documentable, Properties {
	/**
	 * Returns the value of the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Router Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Router Type</em>' attribute.
	 * @see #setConnectionRouterType(int)
	 * @see model.ModelPackage#getDiagramModel_ConnectionRouterType()
	 * @model
	 * @generated
	 */
	int getConnectionRouterType();

	/**
	 * Sets the value of the '{@link model.DiagramModel#getConnectionRouterType <em>Connection Router Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Router Type</em>' attribute.
	 * @see #getConnectionRouterType()
	 * @generated
	 */
	void setConnectionRouterType(int value);

} // DiagramModel
