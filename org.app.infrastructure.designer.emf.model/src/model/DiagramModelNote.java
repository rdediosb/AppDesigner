/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelNote#getBorderType <em>Border Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelNote()
 * @model extendedMetaData="name='Note'"
 * @generated
 */
public interface DiagramModelNote extends DiagramModelObject, TextContent {
	/**
	 * Returns the value of the '<em><b>Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Type</em>' attribute.
	 * @see #setBorderType(int)
	 * @see model.ModelPackage#getDiagramModelNote_BorderType()
	 * @model
	 * @generated
	 */
	int getBorderType();

	/**
	 * Sets the value of the '{@link model.DiagramModelNote#getBorderType <em>Border Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Type</em>' attribute.
	 * @see #getBorderType()
	 * @generated
	 */
	void setBorderType(int value);

} // DiagramModelNote
