# GRAFCET-editor
Graphical editor for IEC 60848 GRAFCET based on a [meta-model](https://github.com/Project-AGRAFE/GRAFCET-meta-model). The editor is implemented using [EMF](https://www.eclipse.org/modeling/emf) and [Sirius](https://www.eclipse.org/sirius).

# Installation
* Install [EMF](https://www.eclipse.org/modeling/emf) and [Sirius](https://www.eclipse.org/sirius) in Eclipse.
* Import the Eclipse projects from the [project](https://github.com/Project-AGRAFE/GRAFCET-editor/tree/main/project) folder into an Eclipse workspace.
* Create a new runtime using _Run Configurations --> Eclipse Application_.
* Import the [Sirius configuration file](https://github.com/Project-AGRAFE/GRAFCET-editor/tree/main/runtime/de.hsu.grafcet.design) of the editor into the Eclipse runtime.

# Create a GRAFCET instance
* Create a Sirius _Modeling Project_.
* Create a new GRAFCET instance using the _Example EMF Model Creation Wizard_ provided by EMF (_New --> Other --> Example EMF Model Creation Wizard --> Grafcet Model_, as _Model Object_ choose _Grafcet_).
* The GRAFCET instance can be edited in the editor that opens. However, for the graphical representation (while the Sirius perspective is opened)  expand the .grafcet file in the _Model Explorer_ and right-klick the GRAFCET instance contained in the .grafcet file _--> New Representation --> Other --> Grafcet_diagram_.
* After the (empty) diagram opens the GRAFCET instance can be editied using the tool palette.
* Start by creating a _Variable Declatation Container_ and a _Partial GRAFCET_.

* Alternatively you can [import existing instances](https://github.com/Project-AGRAFE/GRAFCET-instances).

# Verify the model instance
* The GRAFCET meta-model contains OCL validation rules. To verify those [OCL](https://projects.eclipse.org/projects/modeling.mdt.ocl) must be installed.
* Right-klick a element of the .grafcet file in the tree editor _--> OCL --> Validate_.


# Publications
@ARTICLE{Mross22,
  author={Mross, Robin and Schnakenbeck, Aron and Völker, Marcus and Fay, Alexander and Kowalewski, Stefan},
  journal={IEEE Access}, 
  title={Transformation of GRAFCET Into GAL for Verification Purposes Based on a Detailed Meta-Model}, 
  year={2022},
  volume={10},
  number={},
  pages={125652-125665},
  doi={10.1109/ACCESS.2022.3225736}}
