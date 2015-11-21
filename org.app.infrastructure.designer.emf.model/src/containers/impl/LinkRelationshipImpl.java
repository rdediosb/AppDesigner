/**
 */
package containers.impl;

import containers.ContainersPackage;
import containers.LinkRelationship;

import model.impl.AssociationRelationshipImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LinkRelationshipImpl extends AssociationRelationshipImpl implements LinkRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.LINK_RELATIONSHIP;
	}

} //LinkRelationshipImpl
