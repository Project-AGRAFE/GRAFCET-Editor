# GRAFCET-editor
Graphical editor for IEC 60848 GRAFCET based on a [meta-model](https://github.com/Project-AGRAFE/GRAFCET-meta-model). The editor is implemented using [EMF](https://www.eclipse.org/modeling/emf) and [Sirius](https://www.eclipse.org/sirius).

## Getting started
* Install [EMF](https://www.eclipse.org/modeling/emf) and [Sirius](https://www.eclipse.org/sirius) in Eclipse
* Import the Eclipse projects from the [project](https://github.com/Project-AGRAFE/GRAFCET-editor/tree/main/project) folder
* Create a new runtime using _Run Configurations_ &rarr; _Eclipse Application_
* Import the [Sirius configuration file](https://github.com/Project-AGRAFE/GRAFCET-editor/tree/main/runtime/org.eclipse.sirius.agrafe.grafcet.design) of the editor
* Create a new GRAFCET instance using the _Example EMF Model Creation Wizard_ provided by EMF or import [existing instances](https://github.com/Project-AGRAFE/GRAFCET-instances).
