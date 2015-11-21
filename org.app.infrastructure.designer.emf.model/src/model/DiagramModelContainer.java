/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelContainer#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DiagramModelContainer extends DiagramModelComponent {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link model.DiagramModelObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see model.ModelPackage#getDiagramModelContainer_Children()
	 * @model containment="true"
	 *        extendedMetaData="name='child' kind='element'"
	 * @generated
	 */
	EList<DiagramModelObject> getChildren();

} // DiagramModelContainer
