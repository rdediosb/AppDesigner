/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.Bounds;
import model.DiagramModelConnection;
import model.DiagramModelObject;
import model.FontAttribute;
import model.LineObject;
import model.ModelPackage;
import model.TextAlignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getFont <em>Font</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getTextAlignment <em>Text Alignment</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getSourceConnections <em>Source Connections</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getTargetConnections <em>Target Connections</em>}</li>
 *   <li>{@link model.impl.DiagramModelObjectImpl#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramModelObjectImpl extends DiagramModelComponentImpl implements DiagramModelObject {
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
	 * The default value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_ALIGNMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTextAlignment() <em>Text Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignment()
	 * @generated
	 * @ordered
	 */
	protected int textAlignment = TEXT_ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected Bounds bounds;

	/**
	 * The cached value of the '{@link #getSourceConnections() <em>Source Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramModelConnection> sourceConnections;

	/**
	 * The cached value of the '{@link #getTargetConnections() <em>Target Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramModelConnection> targetConnections;

	/**
	 * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FILL_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillColor()
	 * @generated
	 * @ordered
	 */
	protected String fillColor = FILL_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramModelObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DIAGRAM_MODEL_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__FONT, oldFont, font));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR, oldFontColor, fontColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH, oldLineWidth, lineWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR, oldLineColor, lineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextAlignment() {
		return textAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignment(int newTextAlignment) {
		int oldTextAlignment = textAlignment;
		textAlignment = newTextAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT, oldTextAlignment, textAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		Bounds oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Bounds newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramModelConnection> getSourceConnections() {
		if (sourceConnections == null) {
			sourceConnections = new EObjectContainmentEList<DiagramModelConnection>(DiagramModelConnection.class, this, ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS);
		}
		return sourceConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramModelConnection> getTargetConnections() {
		if (targetConnections == null) {
			targetConnections = new EObjectEList<DiagramModelConnection>(DiagramModelConnection.class, this, ModelPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS);
		}
		return targetConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFillColor() {
		return fillColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(String newFillColor) {
		String oldFillColor = fillColor;
		fillColor = newFillColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR, oldFillColor, fillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addConnection(DiagramModelConnection connection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeConnection(DiagramModelConnection connection) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(int x, int y, int width, int height) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultTextAlignment() {
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
			case ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				return basicSetBounds(null, msgs);
			case ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				return ((InternalEList<?>)getSourceConnections()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT:
				return getFont();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				return getFontColor();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH:
				return getLineWidth();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR:
				return getLineColor();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				return getTextAlignment();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				return getBounds();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				return getSourceConnections();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				return getTargetConnections();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				return getFillColor();
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
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT:
				setFont((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				setFontColor((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR:
				setLineColor((String)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				setTextAlignment((Integer)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				setBounds((Bounds)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				getSourceConnections().clear();
				getSourceConnections().addAll((Collection<? extends DiagramModelConnection>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				getTargetConnections().clear();
				getTargetConnections().addAll((Collection<? extends DiagramModelConnection>)newValue);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				setFillColor((String)newValue);
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
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				setTextAlignment(TEXT_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				setBounds((Bounds)null);
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				getSourceConnections().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				getTargetConnections().clear();
				return;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				setFillColor(FILL_COLOR_EDEFAULT);
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
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR:
				return FONT_COLOR_EDEFAULT == null ? fontColor != null : !FONT_COLOR_EDEFAULT.equals(fontColor);
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? lineColor != null : !LINE_COLOR_EDEFAULT.equals(lineColor);
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT:
				return textAlignment != TEXT_ALIGNMENT_EDEFAULT;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__BOUNDS:
				return bounds != null;
			case ModelPackage.DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS:
				return sourceConnections != null && !sourceConnections.isEmpty();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS:
				return targetConnections != null && !targetConnections.isEmpty();
			case ModelPackage.DIAGRAM_MODEL_OBJECT__FILL_COLOR:
				return FILL_COLOR_EDEFAULT == null ? fillColor != null : !FILL_COLOR_EDEFAULT.equals(fillColor);
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
				case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT: return ModelPackage.FONT_ATTRIBUTE__FONT;
				case ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR: return ModelPackage.FONT_ATTRIBUTE__FONT_COLOR;
				default: return -1;
			}
		}
		if (baseClass == LineObject.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH: return ModelPackage.LINE_OBJECT__LINE_WIDTH;
				case ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR: return ModelPackage.LINE_OBJECT__LINE_COLOR;
				default: return -1;
			}
		}
		if (baseClass == TextAlignment.class) {
			switch (derivedFeatureID) {
				case ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT: return ModelPackage.TEXT_ALIGNMENT__TEXT_ALIGNMENT;
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
				case ModelPackage.FONT_ATTRIBUTE__FONT: return ModelPackage.DIAGRAM_MODEL_OBJECT__FONT;
				case ModelPackage.FONT_ATTRIBUTE__FONT_COLOR: return ModelPackage.DIAGRAM_MODEL_OBJECT__FONT_COLOR;
				default: return -1;
			}
		}
		if (baseClass == LineObject.class) {
			switch (baseFeatureID) {
				case ModelPackage.LINE_OBJECT__LINE_WIDTH: return ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_WIDTH;
				case ModelPackage.LINE_OBJECT__LINE_COLOR: return ModelPackage.DIAGRAM_MODEL_OBJECT__LINE_COLOR;
				default: return -1;
			}
		}
		if (baseClass == TextAlignment.class) {
			switch (baseFeatureID) {
				case ModelPackage.TEXT_ALIGNMENT__TEXT_ALIGNMENT: return ModelPackage.DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == FontAttribute.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == LineObject.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TextAlignment.class) {
			switch (baseOperationID) {
				case ModelPackage.TEXT_ALIGNMENT___GET_DEFAULT_TEXT_ALIGNMENT: return ModelPackage.DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.DIAGRAM_MODEL_OBJECT___ADD_CONNECTION__DIAGRAMMODELCONNECTION:
				addConnection((DiagramModelConnection)arguments.get(0));
				return null;
			case ModelPackage.DIAGRAM_MODEL_OBJECT___REMOVE_CONNECTION__DIAGRAMMODELCONNECTION:
				removeConnection((DiagramModelConnection)arguments.get(0));
				return null;
			case ModelPackage.DIAGRAM_MODEL_OBJECT___SET_BOUNDS__INT_INT_INT_INT:
				setBounds((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ModelPackage.DIAGRAM_MODEL_OBJECT___GET_DEFAULT_TEXT_ALIGNMENT:
				return getDefaultTextAlignment();
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
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineColor: ");
		result.append(lineColor);
		result.append(", textAlignment: ");
		result.append(textAlignment);
		result.append(", fillColor: ");
		result.append(fillColor);
		result.append(')');
		return result.toString();
	}

} //DiagramModelObjectImpl
