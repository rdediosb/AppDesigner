/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DiagramModelObject#getBounds <em>Bounds</em>}</li>
 *   <li>{@link model.DiagramModelObject#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link model.DiagramModelObject#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link model.DiagramModelObject#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDiagramModelObject()
 * @model abstract="true"
 * @generated
 */
public interface DiagramModelObject extends DiagramModelComponent, FontAttribute, LineObject, TextAlignment {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see model.ModelPackage#getDiagramModelObject_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link model.DiagramModelObject#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Source Connections</b></em>' containment reference list.
	 * The list contents are of type {@link model.DiagramModelConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connections</em>' containment reference list.
	 * @see model.ModelPackage#getDiagramModelObject_SourceConnections()
	 * @model containment="true"
	 *        extendedMetaData="name='sourceConnection' kind='element'"
	 * @generated
	 */
	EList<DiagramModelConnection> getSourceConnections();

	/**
	 * Returns the value of the '<em><b>Target Connections</b></em>' reference list.
	 * The list contents are of type {@link model.DiagramModelConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Connections</em>' reference list.
	 * @see model.ModelPackage#getDiagramModelObject_TargetConnections()
	 * @model resolveProxies="false"
	 * @generated
	 */
	EList<DiagramModelConnection> getTargetConnections();

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(String)
	 * @see model.ModelPackage#getDiagramModelObject_FillColor()
	 * @model
	 * @generated
	 */
	String getFillColor();

	/**
	 * Sets the value of the '{@link model.DiagramModelObject#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addConnection(DiagramModelConnection connection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeConnection(DiagramModelConnection connection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBounds(int x, int y, int width, int height);

} // DiagramModelObject
