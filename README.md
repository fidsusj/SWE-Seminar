# Research planning, research und mid-term presentation

## Research planning

### Central research question

Which approaches for automatic system test generation using contract enriched use cases within a transition system 
simulation model as well as using sequence diagrams exist?

### Snowballing

Question                                     | Answer
-------------------------------------------- | --------
Research source                              | IEEE Xplore
_Show references to publication_ existent    | True
_\#Articles_ referencing the article         | 140
_\#Articles_ referenced from the article     | 46
 
### Search term based search

Following search terms were chosen for doing research on the central research question:
- system tests
- automatic generation
- transition system
- simulation model
- use cases
- contracts
- sequence diagrams

__Generic search term:__ "system testing" AND "automatic generation" AND "transition system" AND "simulation model" AND
"use cases" AND contracts AND "sequence diagrams"

__Research Sources:__ IEEE Xplore<sup>[1](#myfootnote1)</sup>, ACM<sup>[2](#myfootnote2)</sup>

__Explanation:__ Pre-search results were promising both on IEEE Xplore and ACM. Only some papers on ACM could not be accessed publicly. 

### Relevance criteria

- Does the method described in the article generate system tests automatically from use cases and other means of the specification area like sequence diagrams?
- Are test objectives generated using some kind of simulation model based on use case contracts (pre- and postconditions) 
or similar transition system approaches?

__Explanation:__ 
- As system tests can not exclusively be derived from means of the specification area, an article should 
restrict to generating system tests from use cases explicitly. Supporting artifacts to generate test scenarios are not prohibited in case they originate
from the specification area.
- To derive test objectives the correctness and consistency of use case combinations should be tested based on their contracts
(pre- and postconditions)
 
## Research execution

### Snowballing based search (forwards and backwards oriented)

####Forward snowballing (140 initial results)

As agreed on in the research planning, only whitepapers from IEEE Xplore or ACM got evaluated.

__IEEE Xplore:__

Title                                                                                                                             | Relevance | Explanation       
--------------------------------------------------------------------------------------------------------------------------------- | --------- | ------------------------------------------------------
Consistency Reflection for Automatic Update of Testing Environment                                                                | No        | Not in the context of automatic system test generation
Consistent Testing Framework for Continuous Service Development                                                                   | No        | Not in the context of automatic system test generation
An Approach to Generate Actor-Oriented Activity Charts from Use Case Requirements                                                 | No        | Not in the context of automatic system test generation
On Adequate Behavior-based Architecture Conformance Checks                                                                        | No        | Not in the context of automatic system test generation
An Automated Test Code Generation Method for Web Applications using Activity Oriented Approach                                    | Possibly  | Uses domain model to represent application state and test activity graphs comprised of self-validating user interactions to verify application correctness
A Novel Approach of Prioritizing Use Case Scenarios                                                                               | No        | Not in the context of automatic system test generation
Automation of Test Case Generation from Behavior Tree Requirements Models                                                         | No        | No use case driven approach
System Testing using UML Models                                                                                                   | Yes       | Proposes a method to design system test cases to achieve coverage of system states based on UML models constructed during normal development process                                                                                                      
An Automatic Tool for Generating Test Cases from the System's Requirements                                                        | Yes       | The system’s requirements are transformed using use case diagrams, flow of events and sequence diagrams. The flow of events and sequence diagrams are used to check the consistency of the use cases as well as the validity of test cases
A Systematic Product Line Test Derivation from Activity Diagrams                                                                  | No        | No use case driven approach
Coping with Requirements Changes in Software Verification and Validation                                                          | No        | Not in the context of automatic system test generation
Test Case Generation for Object-Oriented Systems: A Review                                                                        | Possibly  | Provides a wholistic review instead of explaining a concrete method
An Automatic Approach to Generating a State Diagram from a Contract-Based Class                                                   | No        | Not in the context of automatic system test generation
Generating Test Plans for Acceptance Tests from UML Activity Diagrams                                                             | No        | Only covers high-level acceptance test plans
Model-driven Engineering for Requirements Analysis                                                                                | No        | Not in the context of automatic system test generation
Producing a Global Requirements Model from Multiple Requirement Specifications                                                    | No        | Not in the context of automatic system test generation
Dynamic Test Composition In Hierarchical Software Testing                                                                         | No        | Not in the context of automatic system test generation
Assessing, Comparing, and Combining Statechart- based testing and Structural testing: An Experiment                               | No        | No use case driven approach
Using Metadata in Optimizing the Design and Development of Enterprise Information Systems                                         | No        | Not in the context of automatic system test generation
SSTF: A Novel Automated Test Generation Framework using Software Semantics and Syntax                                             | No        | No transition system driven approach
Automated Test Case Generation from Use Case: A Model Based Approach                                                              | Yes       | The paper proposes IFA (interaction finite automaton), a state based model concentrating on formulizing a system's behaviors specified in use cases without knowing its internal structures
Level Dependencies of Individual Entities in Random Unit Testing of Structured Code                                               | No        | Not in the context of automatic system test generation
Automatic Test Case Generation for Programmable Logic Controller using Function Block Diagram                                     | No        | No use case driven approach
A Novel Approach for Test Case Generation from UML Activity Diagram                                                               | Possibly  | Uses activity diagrams instead of formal languages
Enhancing Data Flow Testing of Classes through Design by Contract                                                                 | No        | No use case driven approach
Functional and User Interface Model for Generating Test Cases                                                                     | No        | No use case driven approach
Validation of Contracts using Enabledness Preserving Finite State Abstractions                                                    | No        | Not in the context of automatic system test generation
Using Dynamic Execution Data to Generate Test Cases                                                                               | No        | No use case driven approach
A Formal Model for Generating Integrated Functional and User Interface Test Cases                                                 | No        | No transition system driven approach
Towards Fully Automated Test Management for Large Complex Systems                                                                 | No        | Not in the context of automatic system test generation
Skyfire: Model-Based Testing With Cucumber                                                                                        | Possibly  | Based on state machine diagram
Auto-generation and redundancy reduction of test cases for reactive systems                                                       | No        | No use case driven approach
Alignment of requirements specification and testing: A systematic mapping study                                                   | No        | Not in the context of automatic system test generation
A Test Automation Language Framework for Behavioral Models                                                                        | No        | No use case driven approach
Requirements Document Based Test Scenario Generation for Web Application Scenario Testing                                         | Yes       | This paper introduces a method to generate test scenarios from semiformal requirements documents such as usecase descriptions and screen transition diagrams
Automatic Test Generation for Energy Consumption of Embedded Systems Modeled in EAST-ADL                                          | No        | No use case driven approach
Software-in-the-Loop Simulation for Early-Stage Testing of AUTOSAR Software Component                                             | No        | Not in the context of automatic system test generation
A UML-Based Approach to Testing Web Applications                                                                                  | Possibly  | This paper proposes a practical test model and test approach for Web applications based on use cases and their corresponding sequence diagrams
An Approach to Modeling and Testing Web Applications Based on Use Cases                                                           | Yes       | Use case transition models are transformed to constraint directed diagrams and then to test cases
Testing security policies: going beyond functional testing                                                                        | No        | Not in the context of automatic system test generation
Scenario Driven Testing                                                                                                           | No        | Not in the context of automatic system test generation
Synthesizing Tests for Combinatorial Coverage of Modal Scenario Specifications                                                    | No        | No transition system driven approach
TCG Algorithm Approach for UML Sequence Diagram                                                                                   | No        | No transition system driven approach
An Automated Approach to System Testing based on Scenarios and Operations Contracts                                               | Yes       | We propose a novel testing approach that uses UML 2.0 models for automated generation of test paths. This is done by enhancing the information with contracts and then formalizing it into a transition system
Bridging the Concept to Implementation Gap in Software System Testing                                                             | No        | No use case driven approach
Comparing Three Notations for Defining Scenario-based Model Tests: A Controlled Experiment                                        | No        | Not in the context of automatic system test generation
A Case Study for Generating Test Cases from Use Cases                                                                             | No        | No transition system driven approach
An approach for Model-Driven test generation                                                                                      | No        | No transition system driven approach
Towards a Systematic Requirement-Based Test Generation Framework: Industrial Challenges and Needs                                 | No        | No use case driven approach
C&L: Generating Model Based Test Cases from Natural Language Requirements Descriptions                                            | No        | No formal use case specification
Towards the Automated Generation of Abstract Test Cases from Requirements Models                                                  | No        | No transition system driven approach
Specifying Use Case Sequencing Constraints using Description Elements                                                             | No        | Not in the context of automatic system test generation
State-of-Practice in GUI-based System and Acceptance Testing: An Industrial Multiple-Case Study                                   | No        | Not in the context of automatic system test generation
Modeling and validating requirements using executable contracts and scenarios                                                     | Possibly  | We have implemented a validation framework that does support the modeling and automated validation of a set of functional and non-functional requirements against several candidates IUTs
An XP inspired test-oriented life-cycle production strategy for building embedded biomedical applications                         | No        | Not in the context of automatic system test generation
User-driven Automatic Test-case Generation for DTV/STB Reliable Functional Verification                                           | No        | No transition system driven approach
Test Generation for Embedded Executables via Concolic Execution in a Real Environment                                             | No        | Not in the context of automatic system test generation
Assessing, Comparing, and Combining State Machine-Based Testing and Structural Testing: A Series of Experiments                   | No        | Provides a wholistic review instead of explaining a concrete method
Automated Abstractions for Contract Validation                                                                                    | Possibly  | We propose a novel technique for automatically constructing abstractions in the form of behavior models from pre/postcondition-based specifications
Supporting the Combined Selection of Model-Based Testing Techniques                                                               | No        | No use case driven approach
Challenges of Variability in Model-Driven and Transformational Approaches: A Systematic Survey                                    | No        | Not in the context of automatic system test generation
GUI Test-Case Generation with Macro-Event Contracts                                                                               | Possibly  | The key idea is to extend high-level GUI scenarios with contracts and use the contracts to infer the ordering dependencies of the scenarios. From the ordering dependencies, a state machine of the system is constructed and used to generate test cases automatically
Automating Acceptance Testing with tool support                                                                                   | No        | No use case driven approach
Integrating Requirements Specification and Model-Based Testing in Agile Development                                               | No        | No transition system driven approach
A Study on Transaction Specification based Software Testing for Internet of Things                                                | No        | No transition system driven approach
Test Path Identification for Internet of Things using Transaction Based Specification                                             | No        | No transition system driven approach
A Transformation-Based Method for Test Case Automatic Generation from Use Cases                                                   | Possibly  | Within our method, we take use cases as source model that are represented by the use case modeling language USL. The target model for test cases is precisely specified using a modeling language named Test Case Specification Language (TCSL)
Risk-based Testing of Self-Adaptive Systems using Run-Time Predictions                                                            | No        | Not in the context of automatic system test generation
Improving Component Based Software Integration Testing Using Data Mining Technique                                                | No        | No use case driven approach
FSM Modeling of Testing Security Policies for MapReduce Frameworks                                                                | No        | Not in the context of automatic system test generation
Design and Implementation of an Automated Test Framework for Electric Power Data Network based on the Unified Resource Scheduling | No        | No use case driven approach

__ACM:__

Title                                                                                                                             | Relevance | Explanation       
--------------------------------------------------------------------------------------------------------------------------------- | --------- | ------------------------------------------------------
A Taxonomy for Requirements Engineering and Software Test Alignment                                                               | No        | Not in the context of automatic system test generation
Automatic Generation of System Test Cases from Use Case Specifications                                                            | No        | No transition system driven approach
Generating Test Cases and Procedures from Use Cases in Dynamic Software Product Lines                                             | No        | No transition system driven approach
Radial Basis Function Neural Network Based Approach To Test Oracle                                                                | No        | No use case driven approach
Model-Based Test Cases Synthesis using UML Interaction Diagrams                                                                   | No        | No transition system driven approach
UML Behavioral Model Based Test Case Generation: A Survey                                                                         | No        | Provides a wholistic review instead of explaining a concrete method
Generating Test Cases and Procedures from Use Cases in Dynamic Software Product Lines                                             | No        | No use case driven approach


####Backward snowballing (46 initials results)

Direct references from the base article have been evaluated in case they were extensively mentioned in the _Related Work_ 
chapter. Other references relate to preceding work that was taken as a basis to build the transition system approach and
shouldn't be further taken into consideration. Another restriction is as in the forward snowballing that only whitepapers 
from IEEE Xplore or ACM got evaluated.

Title                                                                                                                             | Relevance | Explanation       
--------------------------------------------------------------------------------------------------------------------------------- | --------- | ------------------------------------------------------
Boundary coverage criteria for test generation from formal models                                                                 | No        | Not in the context of automatic system test generation
Requirement-Based Automated Black-Box Test Generation                                                                             | Possibly  | The approach accepts a sofhvare specijication as a set of individual requirements expressed in textual and SDL formats (a common practice in the industry). The system model is used to automatically generate test cases related to individual requirements.

### Search term based search

Source      | Date       | Search restrictions                                                                                                                                                                                                                                                                  | Search query                                                                                                                                     | \#Results | \#Relevant results | \#New relevant results | Selected results | Notes
----------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | --------- | ------------------ | ---------------------- | ---------------- | --------------------------
IEEE Xplore | 2020-22-21 | "system tests" in publication title; "automatic generation" in publication title; "transition system" in full text & metadata; "simulation model" in full text & metadata; "use cases" in abstract; "contracts" in full text & metadata; "sequence diagrams" in full text & metadata | "system tests" AND "automatic generation" AND "transition system" AND "simulation model" AND "use cases" AND contracts AND "sequence diagrams"   | 0         | 0                  | /                      | /                | Most detailed search query
IEEE Xplore | 2020-22-21 | "system tests" in abstract; "automatic generation" in abstract; "transition system" in full text & metadata; "use cases" in abstract; "contracts" in full text & metadata; "sequence diagrams" in full text & metadata                                                               | "system tests" AND "automatic generation" AND "transition system" AND "use cases" AND contracts AND "sequence diagrams"                          | 3         | 0                  | /                      | /                | 
IEEE Xplore | 2020-22-21 | "system tests" in abstract; "automatic generation" in abstract; "transition system" in full text & metadata; "use cases" in abstract;                                                                                                                                                | "system tests" AND "automatic generation" AND "transition system" AND "use cases"                                                                | 86        | 0                  | /                      | /                | 

- \#Initial results: (min 50)
- Explain why articles where not chosen according to relevance criteria
- Choose at least one article
- Execute further restrictions on the search criteria

### Choosing one article

- Justify new criteria and the decision which article is chosen
- Document why articles were not chosen


<br />
<br />


<a name="myfootnote1">1</a>: https://ieeexplore.ieee.org/Xplore/home.jsp

<a name="myfootnote2">2</a>: https://dl.acm.org/
