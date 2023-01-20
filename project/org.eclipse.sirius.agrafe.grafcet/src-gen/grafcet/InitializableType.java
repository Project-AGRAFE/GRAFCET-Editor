/**
 */
package grafcet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initializable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcet.InitializableType#isInitial <em>Initial</em>}</li>
 *   <li>{@link grafcet.InitializableType#isActivationLink <em>Activation Link</em>}</li>
 * </ul>
 *
 * @see grafcet.GrafcetPackage#getInitializableType()
 * @model
 * @generated
 */
public interface InitializableType extends Node {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see grafcet.GrafcetPackage#getInitializableType_Initial()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link grafcet.InitializableType#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Activation Link</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Link</em>' attribute.
	 * @see #setActivationLink(boolean)
	 * @see grafcet.GrafcetPackage#getInitializableType_ActivationLink()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isActivationLink();

	/**
	 * Sets the value of the '{@link grafcet.InitializableType#isActivationLink <em>Activation Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Link</em>' attribute.
	 * @see #isActivationLink()
	 * @generated
	 */
	void setActivationLink(boolean value);

} // InitializableType
