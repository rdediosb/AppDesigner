/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.DiagramModelBendpoint;
import model.DiagramModelConnection;
import model.DiagramModelObject;
import model.Documentable;
import model.FontAttribute;
import model.LineObject;
import model.ModelPackage;
import model.Properties;
import model.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getFont <em>Font</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getTextPosition <em>Text Position</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link model.impl.DiagramModelConnectionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramModelConnectionImpl extends DiagramModelComponentImpl implements DiagramModelConnection {
	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected String fontColor = FONT_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected String lineColor = LINE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextPosition() <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTextPosition() <em>Text Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextPosition()
	 * @generated
	 * @ordered
	 */
	protected int textPosition = TEXT_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DiagramModelObject source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DiagramModelObject target;

	/**
	 * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramModelBendpoint> bendpoints;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final int TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected int type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramModelConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DIAGRAM_MODEL_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(String newFontColor) {
		String oldFontColor = fontColor;
		fontColor = newFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR, oldFontColor, fontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineColor() {
		return lineColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(String newLineColor) {
		String oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR, oldLineColor, lineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextPosition() {
		return textPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextPosition(int newTextPosition) {
		int oldTextPosition = textPosition;
		textPosition = newTextPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION, oldTextPosition, textPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelObject getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DiagramModelObject newSource) {
		DiagramModelObject oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramModelObject getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DiagramModelObject newTarget) {
		DiagramModelObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramModelBendpoint> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EObjectContainmentEList<DiagramModelBendpoint>(DiagramModelBendpoint.class, this, ModelPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS);
		}
		return bendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(int newType) {
		int oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connect(DiagramModelObject source, DiagramModelObject target) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disconnect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reconnect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				return ((InternalEList<?>)getBendpoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				return getFont();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				return getFontColor();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				return getProperties();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				return getDocumentation();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				return getLineWidth();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				return getLineColor();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				return getText();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				return getTextPosition();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				return getSource();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				return getTarget();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				return getBendpoints();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				setFont((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				setFontColor((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				setLineColor((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				setText((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				setTextPosition((Integer)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				setSource((DiagramModelObject)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				setTarget((DiagramModelObject)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends DiagramModelBendpoint>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				setType((Integer)newValue);
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
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				getProperties().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				setTextPosition(TEXT_POSITION_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				setSource((DiagramModelObject)null);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				setTarget((DiagramModelObject)null);
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				getBendpoints().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR:
				return FONT_COLOR_EDEFAULT == null ? fontColor != null : !FONT_COLOR_EDEFAULT.equals(fontColor);
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? lineColor != null : !LINE_COLOR_EDEFAULT.equals(lineColor);
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TEXT_POSITION:
				return textPosition != TEXT_POSITION_EDEFAULT;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__SOURCE:
				return source != null;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TARGET:
				return target != null;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case ModelPackage.DIAGRAM_MODEL_CONNECTION__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FontAttribute.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT: return ModelPackage.FONT_ATTRIBUTE__FONT;
				case ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR: return ModelPackage.FONT_ATTRIBUTE__FONT_COLOR;
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES: return ModelPackage.PROPERTIES__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == Documentable.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION: return ModelPackage.DOCUMENTABLE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == LineObject.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH: return ModelPackage.LINE_OBJECT__LINE_WIDTH;
				case ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR: return ModelPackage.LINE_OBJECT__LINE_COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FontAttribute.class) {
			switch (baseFeatureID) {
				case ModelPackage.FONT_ATTRIBUTE__FONT: return ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT;
				case ModelPackage.FONT_ATTRIBUTE__FONT_COLOR: return ModelPackage.DIAGRAM_MODEL_CONNECTION__FONT_COLOR;
				default: return -1;
			}
		}
		if (baseClass == Properties.class) {
			switch (baseFeatureID) {
				case ModelPackage.PROPERTIES__PROPERTIES: return ModelPackage.DIAGRAM_MODEL_CONNECTION__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == Documentable.class) {
			switch (baseFeatureID) {
				case ModelPackage.DOCUMENTABLE__DOCUMENTATION: return ModelPackage.DIAGRAM_MODEL_CONNECTION__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == LineObject.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINE_OBJECT__LINE_WIDTH: return ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_WIDTH;
				case ModelPackage.LINE_OBJECT__LINE_COLOR: return ModelPackage.DIAGRAM_MODEL_CONNECTION__LINE_COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.DIAGRAM_MODEL_CONNECTION___CONNECT__DIAGRAMMODELOBJECT_DIAGRAMMODELOBJECT:
				connect((DiagramModelObject)arguments.get(0), (DiagramModelObject)arguments.get(1));
				return null;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION___DISCONNECT:
				disconnect();
				return null;
			case ModelPackage.DIAGRAM_MODEL_CONNECTION___RECONNECT:
				reconnect();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (font: ");
		result.append(font);
		result.append(", fontColor: ");
		result.append(fontColor);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineColor: ");
		result.append(lineColor);
		result.append(", text: ");
		result.append(text);
		result.append(", textPosition: ");
		result.append(textPosition);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DiagramModelConnectionImpl
