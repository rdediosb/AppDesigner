/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelConnection#getText <em>Text</em>}</li>
 *   <li>{@link model.DiagramModelConnection#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link model.DiagramModelConnection#getSource <em>Source</em>}</li>
 *   <li>{@link model.DiagramModelConnection#getTarget <em>Target</em>}</li>
 *   <li>{@link model.DiagramModelConnection#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link model.DiagramModelConnection#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelConnection()
 * @model
 * @generated
 */
public interface DiagramModelConnection extends DiagramModelComponent, FontAttribute, Properties, Documentable, LineObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see model.ModelPackage#getDiagramModelConnection_Text()
	 * @model default="" transient="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link model.DiagramModelConnection#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Position</em>' attribute.
	 * @see #setTextPosition(int)
	 * @see model.ModelPackage#getDiagramModelConnection_TextPosition()
	 * @model
	 * @generated
	 */
	int getTextPosition();

	/**
	 * Sets the value of the '{@link model.DiagramModelConnection#getTextPosition <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Position</em>' attribute.
	 * @see #getTextPosition()
	 * @generated
	 */
	void setTextPosition(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DiagramModelObject)
	 * @see model.ModelPackage#getDiagramModelConnection_Source()
	 * @model resolveProxies="false"
	 * @generated
	 */
	DiagramModelObject getSource();

	/**
	 * Sets the value of the '{@link model.DiagramModelConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DiagramModelObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DiagramModelObject)
	 * @see model.ModelPackage#getDiagramModelConnection_Target()
	 * @model resolveProxies="false"
	 * @generated
	 */
	DiagramModelObject getTarget();

	/**
	 * Sets the value of the '{@link model.DiagramModelConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DiagramModelObject value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' containment reference list.
	 * The list contents are of type {@link model.DiagramModelBendpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' containment reference list.
	 * @see model.ModelPackage#getDiagramModelConnection_Bendpoints()
	 * @model containment="true"
	 *        extendedMetaData="name='bendpoint' kind='element'"
	 * @generated
	 */
	EList<DiagramModelBendpoint> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see model.ModelPackage#getDiagramModelConnection_Type()
	 * @model
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link model.DiagramModelConnection#getType <em>Type</em>}' attribute.
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
	void connect(DiagramModelObject source, DiagramModelObject target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disconnect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reconnect();

} // DiagramModelConnection
