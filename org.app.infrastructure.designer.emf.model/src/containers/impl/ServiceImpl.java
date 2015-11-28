/**
 */
package containers.impl;

import containers.ContainersPackage;
import containers.Image;
import containers.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link containers.impl.ServiceImpl#getLink <em>Link</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getHost_port <em>Host port</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getContainer_port <em>Container port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Service link;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image;

	/**
	 * The default value of the '{@link #getHost_port() <em>Host port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_port()
	 * @generated
	 * @ordered
	 */
	protected static final int HOST_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHost_port() <em>Host port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost_port()
	 * @generated
	 * @ordered
	 */
	protected int host_port = HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer_port() <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainer_port() <em>Container port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer_port()
	 * @generated
	 * @ordered
	 */
	protected int container_port = CONTAINER_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (Service)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainersPackage.SERVICE__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Service newLink) {
		Service oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.SERVICE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (Image)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainersPackage.SERVICE__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.SERVICE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHost_port() {
		return host_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost_port(int newHost_port) {
		int oldHost_port = host_port;
		host_port = newHost_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.SERVICE__HOST_PORT, oldHost_port, host_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContainer_port() {
		return container_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer_port(int newContainer_port) {
		int oldContainer_port = container_port;
		container_port = newContainer_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.SERVICE__CONTAINER_PORT, oldContainer_port, container_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContainersPackage.SERVICE__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case ContainersPackage.SERVICE__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case ContainersPackage.SERVICE__HOST_PORT:
				return getHost_port();
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				return getContainer_port();
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
			case ContainersPackage.SERVICE__LINK:
				setLink((Service)newValue);
				return;
			case ContainersPackage.SERVICE__IMAGE:
				setImage((Image)newValue);
				return;
			case ContainersPackage.SERVICE__HOST_PORT:
				setHost_port((Integer)newValue);
				return;
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				setContainer_port((Integer)newValue);
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
			case ContainersPackage.SERVICE__LINK:
				setLink((Service)null);
				return;
			case ContainersPackage.SERVICE__IMAGE:
				setImage((Image)null);
				return;
			case ContainersPackage.SERVICE__HOST_PORT:
				setHost_port(HOST_PORT_EDEFAULT);
				return;
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				setContainer_port(CONTAINER_PORT_EDEFAULT);
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
			case ContainersPackage.SERVICE__LINK:
				return link != null;
			case ContainersPackage.SERVICE__IMAGE:
				return image != null;
			case ContainersPackage.SERVICE__HOST_PORT:
				return host_port != HOST_PORT_EDEFAULT;
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				return container_port != CONTAINER_PORT_EDEFAULT;
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
		result.append(" (host_port: ");
		result.append(host_port);
		result.append(", container_port: ");
		result.append(container_port);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
