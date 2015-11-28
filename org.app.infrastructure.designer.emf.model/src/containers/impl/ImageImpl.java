/**
 */
package containers.impl;

import containers.ContainersPackage;
import containers.Image;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link containers.impl.ImageImpl#getImageID <em>Image ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends NamedElementImpl implements Image {
	/**
	 * The default value of the '{@link #getImageID() <em>Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageID() <em>Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageID()
	 * @generated
	 * @ordered
	 */
	protected String imageID = IMAGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageID() {
		return imageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageID(String newImageID) {
		String oldImageID = imageID;
		imageID = newImageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.IMAGE__IMAGE_ID, oldImageID, imageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.IMAGE__IMAGE_ID:
				return getImageID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContainersPackage.IMAGE__IMAGE_ID:
				setImageID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContainersPackage.IMAGE__IMAGE_ID:
				setImageID(IMAGE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContainersPackage.IMAGE__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageID != null : !IMAGE_ID_EDEFAULT.equals(imageID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (imageID: ");
		result.append(imageID);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
