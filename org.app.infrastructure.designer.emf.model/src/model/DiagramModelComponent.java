/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelComponent#getDiagramModel <em>Diagram Model</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelComponent()
 * @model abstract="true"
 * @generated
 */
public interface DiagramModelComponent extends Identifier, model.Cloneable, Adapter, Nameable {
	/**
	 * Returns the value of the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Model</em>' reference.
	 * @see model.ModelPackage#getDiagramModelComponent_DiagramModel()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	DiagramModel getDiagramModel();

} // DiagramModelComponent
