/**
 */
package grafcet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see grafcet.GrafcetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface GrafcetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grafcet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.eclipse.gmf.grafcet/model/grafcet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grafcet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrafcetPackage eINSTANCE = grafcet.impl.GrafcetPackageImpl.init();

	/**
	 * The meta object id for the '{@link grafcet.impl.GrafcetImpl <em>Grafcet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.GrafcetImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getGrafcet()
	 * @generated
	 */
	int GRAFCET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable Declaration Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__VARIABLE_DECLARATION_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Partial Grafcets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__PARTIAL_GRAFCETS = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__STEPS = 3;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__TRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__SYNCHRONIZATIONS = 5;

	/**
	 * The feature id for the '<em><b>Macrosteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__MACROSTEPS = 6;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__ARCS = 7;

	/**
	 * The feature id for the '<em><b>Action Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__ACTION_TYPES = 8;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET__ACTION_LINKS = 9;

	/**
	 * The number of structural features of the '<em>Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFCET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.VariableDeclarationContainerImpl <em>Variable Declaration Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.VariableDeclarationContainerImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getVariableDeclarationContainer()
	 * @generated
	 */
	int VARIABLE_DECLARATION_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS = 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable Declaration Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.PartialGrafcetImpl <em>Partial Grafcet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.PartialGrafcetImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getPartialGrafcet()
	 * @generated
	 */
	int PARTIAL_GRAFCET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__NAME = GRAFCET__NAME;

	/**
	 * The feature id for the '<em><b>Variable Declaration Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__VARIABLE_DECLARATION_CONTAINER = GRAFCET__VARIABLE_DECLARATION_CONTAINER;

	/**
	 * The feature id for the '<em><b>Partial Grafcets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__PARTIAL_GRAFCETS = GRAFCET__PARTIAL_GRAFCETS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__STEPS = GRAFCET__STEPS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__TRANSITIONS = GRAFCET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__SYNCHRONIZATIONS = GRAFCET__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Macrosteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__MACROSTEPS = GRAFCET__MACROSTEPS;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__ARCS = GRAFCET__ARCS;

	/**
	 * The feature id for the '<em><b>Action Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__ACTION_TYPES = GRAFCET__ACTION_TYPES;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__ACTION_LINKS = GRAFCET__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Enclosing Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET__ENCLOSING_STEP = GRAFCET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partial Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET_FEATURE_COUNT = GRAFCET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partial Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_GRAFCET_OPERATION_COUNT = GRAFCET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.MacrostepExpansionImpl <em>Macrostep Expansion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.MacrostepExpansionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getMacrostepExpansion()
	 * @generated
	 */
	int MACROSTEP_EXPANSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__NAME = GRAFCET__NAME;

	/**
	 * The feature id for the '<em><b>Variable Declaration Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__VARIABLE_DECLARATION_CONTAINER = GRAFCET__VARIABLE_DECLARATION_CONTAINER;

	/**
	 * The feature id for the '<em><b>Partial Grafcets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__PARTIAL_GRAFCETS = GRAFCET__PARTIAL_GRAFCETS;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__STEPS = GRAFCET__STEPS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__TRANSITIONS = GRAFCET__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Synchronizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__SYNCHRONIZATIONS = GRAFCET__SYNCHRONIZATIONS;

	/**
	 * The feature id for the '<em><b>Macrosteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__MACROSTEPS = GRAFCET__MACROSTEPS;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__ARCS = GRAFCET__ARCS;

	/**
	 * The feature id for the '<em><b>Action Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__ACTION_TYPES = GRAFCET__ACTION_TYPES;

	/**
	 * The feature id for the '<em><b>Action Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__ACTION_LINKS = GRAFCET__ACTION_LINKS;

	/**
	 * The feature id for the '<em><b>Entry Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__ENTRY_STEP = GRAFCET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION__EXIT_STEP = GRAFCET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Macrostep Expansion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION_FEATURE_COUNT = GRAFCET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Macrostep Expansion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_EXPANSION_OPERATION_COUNT = GRAFCET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.NodeImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.InitializableTypeImpl <em>Initializable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.InitializableTypeImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getInitializableType()
	 * @generated
	 */
	int INITIALIZABLE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_TYPE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_TYPE__INITIAL = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_TYPE__ACTIVATION_LINK = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initializable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_TYPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Initializable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZABLE_TYPE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.EnclosingStepImpl <em>Enclosing Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.EnclosingStepImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getEnclosingStep()
	 * @generated
	 */
	int ENCLOSING_STEP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_STEP__ID = INITIALIZABLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_STEP__INITIAL = INITIALIZABLE_TYPE__INITIAL;

	/**
	 * The feature id for the '<em><b>Activation Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_STEP__ACTIVATION_LINK = INITIALIZABLE_TYPE__ACTIVATION_LINK;

	/**
	 * The feature id for the '<em><b>Partial Grafcets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_STEP__PARTIAL_GRAFCETS = INITIALIZABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enclosing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_STEP_FEATURE_COUNT = INITIALIZABLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enclosing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCLOSING_STEP_OPERATION_COUNT = INITIALIZABLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.StepImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = INITIALIZABLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INITIAL = INITIALIZABLE_TYPE__INITIAL;

	/**
	 * The feature id for the '<em><b>Activation Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ACTIVATION_LINK = INITIALIZABLE_TYPE__ACTIVATION_LINK;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = INITIALIZABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = INITIALIZABLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.TransitionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TERM = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DELAY_TIME = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reset Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESET_TIME = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNIT = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TIME_CONDITION_TYPE = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Condition Term Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Condition Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link grafcet.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.SynchronizationImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.MacrostepImpl <em>Macrostep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.MacrostepImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getMacrostep()
	 * @generated
	 */
	int MACROSTEP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Expansion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP__EXPANSION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Macrostep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Macrostep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACROSTEP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.EntryStepImpl <em>Entry Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.EntryStepImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getEntryStep()
	 * @generated
	 */
	int ENTRY_STEP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_STEP__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Entry Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_STEP_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_STEP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.ExitStepImpl <em>Exit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ExitStepImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getExitStep()
	 * @generated
	 */
	int EXIT_STEP = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STEP__ID = NODE__ID;

	/**
	 * The number of structural features of the '<em>Exit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STEP_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_STEP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ArcImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ActionTypeImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.ForcingOrderImpl <em>Forcing Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ForcingOrderImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getForcingOrder()
	 * @generated
	 */
	int FORCING_ORDER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_ORDER__ID = ACTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Partial Grafcet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_ORDER__PARTIAL_GRAFCET = ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forced Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_ORDER__FORCED_STEPS = ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forcing Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_ORDER__FORCING_ORDER_TYPE = ACTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Forcing Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_ORDER_FEATURE_COUNT = ACTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Forcing Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCING_ORDER_OPERATION_COUNT = ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ActionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = ACTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VARIABLE = ACTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ACTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Action Output Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ACTION_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link grafcet.impl.StoredActionImpl <em>Stored Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.StoredActionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getStoredAction()
	 * @generated
	 */
	int STORED_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__VARIABLE = ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__TERM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stored Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__STORED_ACTION_TYPE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION__VALUE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stored Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Action Output Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Condition Term Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Condition Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stored Action Cond Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___STORED_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Stored Action Var Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION___STORED_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Stored Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link grafcet.impl.ContinuousActionImpl <em>Continuous Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ContinuousActionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getContinuousAction()
	 * @generated
	 */
	int CONTINUOUS_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__ID = ACTION__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__VARIABLE = ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__TERM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__DELAY_TIME = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reset Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__RESET_TIME = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__UNIT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__TIME_CONDITION_TYPE = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Continuous Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Continuous Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Action Output Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Condition Term Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Condition Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Continuous Action Cond Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION___CONTINUOUS_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Continuous Action Var Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION___CONTINUOUS_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP = ACTION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Continuous Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link grafcet.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ActionLinkImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 19;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__STEP = 0;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__ACTION_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafcet.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.ConditionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TERM = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Condition Term Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Condition Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link grafcet.impl.TimeConditionImpl <em>Time Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.impl.TimeConditionImpl
	 * @see grafcet.impl.GrafcetPackageImpl#getTimeCondition()
	 * @generated
	 */
	int TIME_CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__TERM = CONDITION__TERM;

	/**
	 * The feature id for the '<em><b>Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__DELAY_TIME = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__RESET_TIME = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__UNIT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION__TIME_CONDITION_TYPE = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Condition Term Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP = CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Condition Variable Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Time Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grafcet.ForcingOrderType <em>Forcing Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.ForcingOrderType
	 * @see grafcet.impl.GrafcetPackageImpl#getForcingOrderType()
	 * @generated
	 */
	int FORCING_ORDER_TYPE = 22;

	/**
	 * The meta object id for the '{@link grafcet.StoredActionType <em>Stored Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.StoredActionType
	 * @see grafcet.impl.GrafcetPackageImpl#getStoredActionType()
	 * @generated
	 */
	int STORED_ACTION_TYPE = 23;

	/**
	 * The meta object id for the '{@link grafcet.ContinuousActionType <em>Continuous Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.ContinuousActionType
	 * @see grafcet.impl.GrafcetPackageImpl#getContinuousActionType()
	 * @generated
	 */
	int CONTINUOUS_ACTION_TYPE = 24;

	/**
	 * The meta object id for the '{@link grafcet.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.TimeUnit
	 * @see grafcet.impl.GrafcetPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 25;

	/**
	 * The meta object id for the '{@link grafcet.TimeConditionType <em>Time Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafcet.TimeConditionType
	 * @see grafcet.impl.GrafcetPackageImpl#getTimeConditionType()
	 * @generated
	 */
	int TIME_CONDITION_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link grafcet.Grafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grafcet</em>'.
	 * @see grafcet.Grafcet
	 * @generated
	 */
	EClass getGrafcet();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.Grafcet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grafcet.Grafcet#getName()
	 * @see #getGrafcet()
	 * @generated
	 */
	EAttribute getGrafcet_Name();

	/**
	 * Returns the meta object for the containment reference '{@link grafcet.Grafcet#getVariableDeclarationContainer <em>Variable Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Declaration Container</em>'.
	 * @see grafcet.Grafcet#getVariableDeclarationContainer()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_VariableDeclarationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getPartialGrafcets <em>Partial Grafcets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partial Grafcets</em>'.
	 * @see grafcet.Grafcet#getPartialGrafcets()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_PartialGrafcets();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see grafcet.Grafcet#getSteps()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see grafcet.Grafcet#getTransitions()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getSynchronizations <em>Synchronizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronizations</em>'.
	 * @see grafcet.Grafcet#getSynchronizations()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Synchronizations();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getMacrosteps <em>Macrosteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macrosteps</em>'.
	 * @see grafcet.Grafcet#getMacrosteps()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Macrosteps();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see grafcet.Grafcet#getArcs()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getActionTypes <em>Action Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Types</em>'.
	 * @see grafcet.Grafcet#getActionTypes()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_ActionTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.Grafcet#getActionLinks <em>Action Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Links</em>'.
	 * @see grafcet.Grafcet#getActionLinks()
	 * @see #getGrafcet()
	 * @generated
	 */
	EReference getGrafcet_ActionLinks();

	/**
	 * Returns the meta object for class '{@link grafcet.VariableDeclarationContainer <em>Variable Declaration Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Container</em>'.
	 * @see grafcet.VariableDeclarationContainer
	 * @generated
	 */
	EClass getVariableDeclarationContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.VariableDeclarationContainer#getVariableDeclarations <em>Variable Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
	 * @see grafcet.VariableDeclarationContainer#getVariableDeclarations()
	 * @see #getVariableDeclarationContainer()
	 * @generated
	 */
	EReference getVariableDeclarationContainer_VariableDeclarations();

	/**
	 * Returns the meta object for class '{@link grafcet.PartialGrafcet <em>Partial Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Grafcet</em>'.
	 * @see grafcet.PartialGrafcet
	 * @generated
	 */
	EClass getPartialGrafcet();

	/**
	 * Returns the meta object for the reference '{@link grafcet.PartialGrafcet#getEnclosingStep <em>Enclosing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enclosing Step</em>'.
	 * @see grafcet.PartialGrafcet#getEnclosingStep()
	 * @see #getPartialGrafcet()
	 * @generated
	 */
	EReference getPartialGrafcet_EnclosingStep();

	/**
	 * Returns the meta object for class '{@link grafcet.MacrostepExpansion <em>Macrostep Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macrostep Expansion</em>'.
	 * @see grafcet.MacrostepExpansion
	 * @generated
	 */
	EClass getMacrostepExpansion();

	/**
	 * Returns the meta object for the containment reference list '{@link grafcet.MacrostepExpansion#getEntryStep <em>Entry Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Step</em>'.
	 * @see grafcet.MacrostepExpansion#getEntryStep()
	 * @see #getMacrostepExpansion()
	 * @generated
	 */
	EReference getMacrostepExpansion_EntryStep();

	/**
	 * Returns the meta object for the containment reference '{@link grafcet.MacrostepExpansion#getExitStep <em>Exit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Step</em>'.
	 * @see grafcet.MacrostepExpansion#getExitStep()
	 * @see #getMacrostepExpansion()
	 * @generated
	 */
	EReference getMacrostepExpansion_ExitStep();

	/**
	 * Returns the meta object for class '{@link grafcet.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see grafcet.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see grafcet.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link grafcet.InitializableType <em>Initializable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializable Type</em>'.
	 * @see grafcet.InitializableType
	 * @generated
	 */
	EClass getInitializableType();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.InitializableType#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see grafcet.InitializableType#isInitial()
	 * @see #getInitializableType()
	 * @generated
	 */
	EAttribute getInitializableType_Initial();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.InitializableType#isActivationLink <em>Activation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Link</em>'.
	 * @see grafcet.InitializableType#isActivationLink()
	 * @see #getInitializableType()
	 * @generated
	 */
	EAttribute getInitializableType_ActivationLink();

	/**
	 * Returns the meta object for class '{@link grafcet.EnclosingStep <em>Enclosing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enclosing Step</em>'.
	 * @see grafcet.EnclosingStep
	 * @generated
	 */
	EClass getEnclosingStep();

	/**
	 * Returns the meta object for the reference list '{@link grafcet.EnclosingStep#getPartialGrafcets <em>Partial Grafcets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partial Grafcets</em>'.
	 * @see grafcet.EnclosingStep#getPartialGrafcets()
	 * @see #getEnclosingStep()
	 * @generated
	 */
	EReference getEnclosingStep_PartialGrafcets();

	/**
	 * Returns the meta object for class '{@link grafcet.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see grafcet.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link grafcet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see grafcet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link grafcet.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see grafcet.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for class '{@link grafcet.Macrostep <em>Macrostep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macrostep</em>'.
	 * @see grafcet.Macrostep
	 * @generated
	 */
	EClass getMacrostep();

	/**
	 * Returns the meta object for the reference '{@link grafcet.Macrostep#getExpansion <em>Expansion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expansion</em>'.
	 * @see grafcet.Macrostep#getExpansion()
	 * @see #getMacrostep()
	 * @generated
	 */
	EReference getMacrostep_Expansion();

	/**
	 * Returns the meta object for class '{@link grafcet.EntryStep <em>Entry Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Step</em>'.
	 * @see grafcet.EntryStep
	 * @generated
	 */
	EClass getEntryStep();

	/**
	 * Returns the meta object for class '{@link grafcet.ExitStep <em>Exit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Step</em>'.
	 * @see grafcet.ExitStep
	 * @generated
	 */
	EClass getExitStep();

	/**
	 * Returns the meta object for class '{@link grafcet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see grafcet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link grafcet.Arc#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see grafcet.Arc#getSource()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Source();

	/**
	 * Returns the meta object for the reference '{@link grafcet.Arc#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see grafcet.Arc#getTarget()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Target();

	/**
	 * Returns the meta object for class '{@link grafcet.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see grafcet.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.ActionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see grafcet.ActionType#getId()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Id();

	/**
	 * Returns the meta object for class '{@link grafcet.ForcingOrder <em>Forcing Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forcing Order</em>'.
	 * @see grafcet.ForcingOrder
	 * @generated
	 */
	EClass getForcingOrder();

	/**
	 * Returns the meta object for the reference '{@link grafcet.ForcingOrder#getPartialGrafcet <em>Partial Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partial Grafcet</em>'.
	 * @see grafcet.ForcingOrder#getPartialGrafcet()
	 * @see #getForcingOrder()
	 * @generated
	 */
	EReference getForcingOrder_PartialGrafcet();

	/**
	 * Returns the meta object for the reference list '{@link grafcet.ForcingOrder#getForcedSteps <em>Forced Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forced Steps</em>'.
	 * @see grafcet.ForcingOrder#getForcedSteps()
	 * @see #getForcingOrder()
	 * @generated
	 */
	EReference getForcingOrder_ForcedSteps();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.ForcingOrder#getForcingOrderType <em>Forcing Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forcing Order Type</em>'.
	 * @see grafcet.ForcingOrder#getForcingOrderType()
	 * @see #getForcingOrder()
	 * @generated
	 */
	EAttribute getForcingOrder_ForcingOrderType();

	/**
	 * Returns the meta object for class '{@link grafcet.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see grafcet.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link grafcet.Action#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see grafcet.Action#getVariable()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Variable();

	/**
	 * Returns the meta object for the '{@link grafcet.Action#ActionOutputVariableType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Action Output Variable Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Output Variable Type</em>' operation.
	 * @see grafcet.Action#ActionOutputVariableType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAction__ActionOutputVariableType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link grafcet.StoredAction <em>Stored Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stored Action</em>'.
	 * @see grafcet.StoredAction
	 * @generated
	 */
	EClass getStoredAction();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.StoredAction#getStoredActionType <em>Stored Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stored Action Type</em>'.
	 * @see grafcet.StoredAction#getStoredActionType()
	 * @see #getStoredAction()
	 * @generated
	 */
	EAttribute getStoredAction_StoredActionType();

	/**
	 * Returns the meta object for the containment reference '{@link grafcet.StoredAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see grafcet.StoredAction#getValue()
	 * @see #getStoredAction()
	 * @generated
	 */
	EReference getStoredAction_Value();

	/**
	 * Returns the meta object for the '{@link grafcet.StoredAction#StoredActionCondType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stored Action Cond Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stored Action Cond Type</em>' operation.
	 * @see grafcet.StoredAction#StoredActionCondType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStoredAction__StoredActionCondType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link grafcet.StoredAction#StoredActionVarType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stored Action Var Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stored Action Var Type</em>' operation.
	 * @see grafcet.StoredAction#StoredActionVarType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStoredAction__StoredActionVarType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link grafcet.ContinuousAction <em>Continuous Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Action</em>'.
	 * @see grafcet.ContinuousAction
	 * @generated
	 */
	EClass getContinuousAction();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.ContinuousAction#getContinuousActionType <em>Continuous Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuous Action Type</em>'.
	 * @see grafcet.ContinuousAction#getContinuousActionType()
	 * @see #getContinuousAction()
	 * @generated
	 */
	EAttribute getContinuousAction_ContinuousActionType();

	/**
	 * Returns the meta object for the '{@link grafcet.ContinuousAction#ContinuousActionCondType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Continuous Action Cond Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Continuous Action Cond Type</em>' operation.
	 * @see grafcet.ContinuousAction#ContinuousActionCondType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContinuousAction__ContinuousActionCondType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link grafcet.ContinuousAction#ContinuousActionVarType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Continuous Action Var Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Continuous Action Var Type</em>' operation.
	 * @see grafcet.ContinuousAction#ContinuousActionVarType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getContinuousAction__ContinuousActionVarType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link grafcet.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see grafcet.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for the reference '{@link grafcet.ActionLink#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see grafcet.ActionLink#getStep()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Step();

	/**
	 * Returns the meta object for the reference '{@link grafcet.ActionLink#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Type</em>'.
	 * @see grafcet.ActionLink#getActionType()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_ActionType();

	/**
	 * Returns the meta object for class '{@link grafcet.TimeCondition <em>Time Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Condition</em>'.
	 * @see grafcet.TimeCondition
	 * @generated
	 */
	EClass getTimeCondition();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.TimeCondition#getDelayTime <em>Delay Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay Time</em>'.
	 * @see grafcet.TimeCondition#getDelayTime()
	 * @see #getTimeCondition()
	 * @generated
	 */
	EAttribute getTimeCondition_DelayTime();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.TimeCondition#getResetTime <em>Reset Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Time</em>'.
	 * @see grafcet.TimeCondition#getResetTime()
	 * @see #getTimeCondition()
	 * @generated
	 */
	EAttribute getTimeCondition_ResetTime();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.TimeCondition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see grafcet.TimeCondition#getUnit()
	 * @see #getTimeCondition()
	 * @generated
	 */
	EAttribute getTimeCondition_Unit();

	/**
	 * Returns the meta object for the attribute '{@link grafcet.TimeCondition#getTimeConditionType <em>Time Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Condition Type</em>'.
	 * @see grafcet.TimeCondition#getTimeConditionType()
	 * @see #getTimeCondition()
	 * @generated
	 */
	EAttribute getTimeCondition_TimeConditionType();

	/**
	 * Returns the meta object for class '{@link grafcet.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see grafcet.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link grafcet.Condition#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term</em>'.
	 * @see grafcet.Condition#getTerm()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Term();

	/**
	 * Returns the meta object for the '{@link grafcet.Condition#ConditionTermType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition Term Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Condition Term Type</em>' operation.
	 * @see grafcet.Condition#ConditionTermType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondition__ConditionTermType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link grafcet.Condition#ConditionVariableType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condition Variable Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Condition Variable Type</em>' operation.
	 * @see grafcet.Condition#ConditionVariableType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondition__ConditionVariableType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link grafcet.ForcingOrderType <em>Forcing Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Forcing Order Type</em>'.
	 * @see grafcet.ForcingOrderType
	 * @generated
	 */
	EEnum getForcingOrderType();

	/**
	 * Returns the meta object for enum '{@link grafcet.StoredActionType <em>Stored Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stored Action Type</em>'.
	 * @see grafcet.StoredActionType
	 * @generated
	 */
	EEnum getStoredActionType();

	/**
	 * Returns the meta object for enum '{@link grafcet.ContinuousActionType <em>Continuous Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Continuous Action Type</em>'.
	 * @see grafcet.ContinuousActionType
	 * @generated
	 */
	EEnum getContinuousActionType();

	/**
	 * Returns the meta object for enum '{@link grafcet.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see grafcet.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link grafcet.TimeConditionType <em>Time Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Condition Type</em>'.
	 * @see grafcet.TimeConditionType
	 * @generated
	 */
	EEnum getTimeConditionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrafcetFactory getGrafcetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link grafcet.impl.GrafcetImpl <em>Grafcet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.GrafcetImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getGrafcet()
		 * @generated
		 */
		EClass GRAFCET = eINSTANCE.getGrafcet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAFCET__NAME = eINSTANCE.getGrafcet_Name();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__VARIABLE_DECLARATION_CONTAINER = eINSTANCE.getGrafcet_VariableDeclarationContainer();

		/**
		 * The meta object literal for the '<em><b>Partial Grafcets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__PARTIAL_GRAFCETS = eINSTANCE.getGrafcet_PartialGrafcets();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__STEPS = eINSTANCE.getGrafcet_Steps();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__TRANSITIONS = eINSTANCE.getGrafcet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Synchronizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__SYNCHRONIZATIONS = eINSTANCE.getGrafcet_Synchronizations();

		/**
		 * The meta object literal for the '<em><b>Macrosteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__MACROSTEPS = eINSTANCE.getGrafcet_Macrosteps();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__ARCS = eINSTANCE.getGrafcet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Action Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__ACTION_TYPES = eINSTANCE.getGrafcet_ActionTypes();

		/**
		 * The meta object literal for the '<em><b>Action Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFCET__ACTION_LINKS = eINSTANCE.getGrafcet_ActionLinks();

		/**
		 * The meta object literal for the '{@link grafcet.impl.VariableDeclarationContainerImpl <em>Variable Declaration Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.VariableDeclarationContainerImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getVariableDeclarationContainer()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_CONTAINER = eINSTANCE.getVariableDeclarationContainer();

		/**
		 * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_CONTAINER__VARIABLE_DECLARATIONS = eINSTANCE.getVariableDeclarationContainer_VariableDeclarations();

		/**
		 * The meta object literal for the '{@link grafcet.impl.PartialGrafcetImpl <em>Partial Grafcet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.PartialGrafcetImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getPartialGrafcet()
		 * @generated
		 */
		EClass PARTIAL_GRAFCET = eINSTANCE.getPartialGrafcet();

		/**
		 * The meta object literal for the '<em><b>Enclosing Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_GRAFCET__ENCLOSING_STEP = eINSTANCE.getPartialGrafcet_EnclosingStep();

		/**
		 * The meta object literal for the '{@link grafcet.impl.MacrostepExpansionImpl <em>Macrostep Expansion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.MacrostepExpansionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getMacrostepExpansion()
		 * @generated
		 */
		EClass MACROSTEP_EXPANSION = eINSTANCE.getMacrostepExpansion();

		/**
		 * The meta object literal for the '<em><b>Entry Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACROSTEP_EXPANSION__ENTRY_STEP = eINSTANCE.getMacrostepExpansion_EntryStep();

		/**
		 * The meta object literal for the '<em><b>Exit Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACROSTEP_EXPANSION__EXIT_STEP = eINSTANCE.getMacrostepExpansion_ExitStep();

		/**
		 * The meta object literal for the '{@link grafcet.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.NodeImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link grafcet.impl.InitializableTypeImpl <em>Initializable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.InitializableTypeImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getInitializableType()
		 * @generated
		 */
		EClass INITIALIZABLE_TYPE = eINSTANCE.getInitializableType();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZABLE_TYPE__INITIAL = eINSTANCE.getInitializableType_Initial();

		/**
		 * The meta object literal for the '<em><b>Activation Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZABLE_TYPE__ACTIVATION_LINK = eINSTANCE.getInitializableType_ActivationLink();

		/**
		 * The meta object literal for the '{@link grafcet.impl.EnclosingStepImpl <em>Enclosing Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.EnclosingStepImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getEnclosingStep()
		 * @generated
		 */
		EClass ENCLOSING_STEP = eINSTANCE.getEnclosingStep();

		/**
		 * The meta object literal for the '<em><b>Partial Grafcets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCLOSING_STEP__PARTIAL_GRAFCETS = eINSTANCE.getEnclosingStep_PartialGrafcets();

		/**
		 * The meta object literal for the '{@link grafcet.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.StepImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link grafcet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.TransitionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link grafcet.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.SynchronizationImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '{@link grafcet.impl.MacrostepImpl <em>Macrostep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.MacrostepImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getMacrostep()
		 * @generated
		 */
		EClass MACROSTEP = eINSTANCE.getMacrostep();

		/**
		 * The meta object literal for the '<em><b>Expansion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACROSTEP__EXPANSION = eINSTANCE.getMacrostep_Expansion();

		/**
		 * The meta object literal for the '{@link grafcet.impl.EntryStepImpl <em>Entry Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.EntryStepImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getEntryStep()
		 * @generated
		 */
		EClass ENTRY_STEP = eINSTANCE.getEntryStep();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ExitStepImpl <em>Exit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ExitStepImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getExitStep()
		 * @generated
		 */
		EClass EXIT_STEP = eINSTANCE.getExitStep();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ArcImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SOURCE = eINSTANCE.getArc_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TARGET = eINSTANCE.getArc_Target();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ActionTypeImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__ID = eINSTANCE.getActionType_Id();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ForcingOrderImpl <em>Forcing Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ForcingOrderImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getForcingOrder()
		 * @generated
		 */
		EClass FORCING_ORDER = eINSTANCE.getForcingOrder();

		/**
		 * The meta object literal for the '<em><b>Partial Grafcet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCING_ORDER__PARTIAL_GRAFCET = eINSTANCE.getForcingOrder_PartialGrafcet();

		/**
		 * The meta object literal for the '<em><b>Forced Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCING_ORDER__FORCED_STEPS = eINSTANCE.getForcingOrder_ForcedSteps();

		/**
		 * The meta object literal for the '<em><b>Forcing Order Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCING_ORDER__FORCING_ORDER_TYPE = eINSTANCE.getForcingOrder_ForcingOrderType();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ActionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__VARIABLE = eINSTANCE.getAction_Variable();

		/**
		 * The meta object literal for the '<em><b>Action Output Variable Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ACTION_OUTPUT_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAction__ActionOutputVariableType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link grafcet.impl.StoredActionImpl <em>Stored Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.StoredActionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getStoredAction()
		 * @generated
		 */
		EClass STORED_ACTION = eINSTANCE.getStoredAction();

		/**
		 * The meta object literal for the '<em><b>Stored Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORED_ACTION__STORED_ACTION_TYPE = eINSTANCE.getStoredAction_StoredActionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORED_ACTION__VALUE = eINSTANCE.getStoredAction_Value();

		/**
		 * The meta object literal for the '<em><b>Stored Action Cond Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORED_ACTION___STORED_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStoredAction__StoredActionCondType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Stored Action Var Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORED_ACTION___STORED_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStoredAction__StoredActionVarType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ContinuousActionImpl <em>Continuous Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ContinuousActionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getContinuousAction()
		 * @generated
		 */
		EClass CONTINUOUS_ACTION = eINSTANCE.getContinuousAction();

		/**
		 * The meta object literal for the '<em><b>Continuous Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE = eINSTANCE.getContinuousAction_ContinuousActionType();

		/**
		 * The meta object literal for the '<em><b>Continuous Action Cond Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUOUS_ACTION___CONTINUOUS_ACTION_COND_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getContinuousAction__ContinuousActionCondType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Continuous Action Var Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTINUOUS_ACTION___CONTINUOUS_ACTION_VAR_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getContinuousAction__ContinuousActionVarType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ActionLinkImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACTION_LINK = eINSTANCE.getActionLink();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__STEP = eINSTANCE.getActionLink_Step();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__ACTION_TYPE = eINSTANCE.getActionLink_ActionType();

		/**
		 * The meta object literal for the '{@link grafcet.impl.TimeConditionImpl <em>Time Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.TimeConditionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getTimeCondition()
		 * @generated
		 */
		EClass TIME_CONDITION = eINSTANCE.getTimeCondition();

		/**
		 * The meta object literal for the '<em><b>Delay Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONDITION__DELAY_TIME = eINSTANCE.getTimeCondition_DelayTime();

		/**
		 * The meta object literal for the '<em><b>Reset Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONDITION__RESET_TIME = eINSTANCE.getTimeCondition_ResetTime();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONDITION__UNIT = eINSTANCE.getTimeCondition_Unit();

		/**
		 * The meta object literal for the '<em><b>Time Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONDITION__TIME_CONDITION_TYPE = eINSTANCE.getTimeCondition_TimeConditionType();

		/**
		 * The meta object literal for the '{@link grafcet.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.impl.ConditionImpl
		 * @see grafcet.impl.GrafcetPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__TERM = eINSTANCE.getCondition_Term();

		/**
		 * The meta object literal for the '<em><b>Condition Term Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___CONDITION_TERM_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCondition__ConditionTermType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Condition Variable Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___CONDITION_VARIABLE_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCondition__ConditionVariableType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link grafcet.ForcingOrderType <em>Forcing Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.ForcingOrderType
		 * @see grafcet.impl.GrafcetPackageImpl#getForcingOrderType()
		 * @generated
		 */
		EEnum FORCING_ORDER_TYPE = eINSTANCE.getForcingOrderType();

		/**
		 * The meta object literal for the '{@link grafcet.StoredActionType <em>Stored Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.StoredActionType
		 * @see grafcet.impl.GrafcetPackageImpl#getStoredActionType()
		 * @generated
		 */
		EEnum STORED_ACTION_TYPE = eINSTANCE.getStoredActionType();

		/**
		 * The meta object literal for the '{@link grafcet.ContinuousActionType <em>Continuous Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.ContinuousActionType
		 * @see grafcet.impl.GrafcetPackageImpl#getContinuousActionType()
		 * @generated
		 */
		EEnum CONTINUOUS_ACTION_TYPE = eINSTANCE.getContinuousActionType();

		/**
		 * The meta object literal for the '{@link grafcet.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.TimeUnit
		 * @see grafcet.impl.GrafcetPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link grafcet.TimeConditionType <em>Time Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafcet.TimeConditionType
		 * @see grafcet.impl.GrafcetPackageImpl#getTimeConditionType()
		 * @generated
		 */
		EEnum TIME_CONDITION_TYPE = eINSTANCE.getTimeConditionType();

	}

} //GrafcetPackage
