/**
 */
package containers.impl;

import containers.Application;
import containers.ContainersPackage;
import containers.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link containers.impl.ServiceImpl#getLink <em>Link</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getHost_port <em>Host port</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getContainer_port <em>Container port</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getApp <em>App</em>}</li>
 *   <li>{@link containers.impl.ServiceImpl#getEnvs <em>Envs</em>}</li>
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
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApp() <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp()
	 * @generated
	 * @ordered
	 */
	protected Application app;

	/**
	 * The cached value of the '{@link #getEnvs() <em>Envs</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvs()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> envs;

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
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.SERVICE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApp() {
		if (app != null && app.eIsProxy()) {
			InternalEObject oldApp = (InternalEObject)app;
			app = (Application)eResolveProxy(oldApp);
			if (app != oldApp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContainersPackage.SERVICE__APP, oldApp, app));
			}
		}
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApp() {
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(Application newApp) {
		Application oldApp = app;
		app = newApp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.SERVICE__APP, oldApp, app));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getEnvs() {
		if (envs == null) {
			envs = new EcoreEMap<String,String>(ContainersPackage.Literals.ENKV, ENKVImpl.class, this, ContainersPackage.SERVICE__ENVS);
		}
		return envs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContainersPackage.SERVICE__ENVS:
				return ((InternalEList<?>)getEnvs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ContainersPackage.SERVICE__HOST_PORT:
				return getHost_port();
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				return getContainer_port();
			case ContainersPackage.SERVICE__IMAGE:
				return getImage();
			case ContainersPackage.SERVICE__APP:
				if (resolve) return getApp();
				return basicGetApp();
			case ContainersPackage.SERVICE__ENVS:
				if (coreType) return getEnvs();
				else return getEnvs().map();
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
			case ContainersPackage.SERVICE__HOST_PORT:
				setHost_port((Integer)newValue);
				return;
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				setContainer_port((Integer)newValue);
				return;
			case ContainersPackage.SERVICE__IMAGE:
				setImage((String)newValue);
				return;
			case ContainersPackage.SERVICE__APP:
				setApp((Application)newValue);
				return;
			case ContainersPackage.SERVICE__ENVS:
				((EStructuralFeature.Setting)getEnvs()).set(newValue);
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
			case ContainersPackage.SERVICE__HOST_PORT:
				setHost_port(HOST_PORT_EDEFAULT);
				return;
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				setContainer_port(CONTAINER_PORT_EDEFAULT);
				return;
			case ContainersPackage.SERVICE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case ContainersPackage.SERVICE__APP:
				setApp((Application)null);
				return;
			case ContainersPackage.SERVICE__ENVS:
				getEnvs().clear();
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
			case ContainersPackage.SERVICE__HOST_PORT:
				return host_port != HOST_PORT_EDEFAULT;
			case ContainersPackage.SERVICE__CONTAINER_PORT:
				return container_port != CONTAINER_PORT_EDEFAULT;
			case ContainersPackage.SERVICE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case ContainersPackage.SERVICE__APP:
				return app != null;
			case ContainersPackage.SERVICE__ENVS:
				return envs != null && !envs.isEmpty();
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
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
