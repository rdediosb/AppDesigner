/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Alignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.TextAlignment#getTextAlignment <em>Text Alignment</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getTextAlignment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TextAlignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Alignment</em>' attribute.
	 * @see #setTextAlignment(int)
	 * @see model.ModelPackage#getTextAlignment_TextAlignment()
	 * @model
	 * @generated
	 */
	int getTextAlignment();

	/**
	 * Sets the value of the '{@link model.TextAlignment#getTextAlignment <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Alignment</em>' attribute.
	 * @see #getTextAlignment()
	 * @generated
	 */
	void setTextAlignment(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getDefaultTextAlignment();

} // TextAlignment
