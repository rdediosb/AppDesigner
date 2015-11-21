/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.FolderContainer#getFolders <em>Folders</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getFolderContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FolderContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link model.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see model.ModelPackage#getFolderContainer_Folders()
	 * @model containment="true"
	 *        extendedMetaData="name='folder' kind='element'"
	 * @generated
	 */
	EList<Folder> getFolders();

} // FolderContainer
