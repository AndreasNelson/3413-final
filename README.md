# Therac-25 Simulation with Safety Enhancements

## Project Overview

This project simulates the Therac-25 radiation therapy machine, with a focus on implementing safety features to address the design flaws that led to real-world accidents. It was developed as the final project for a computer systems concepts course.

## Project Goals

The main goals of this project were:

* To understand the design flaws and safety-critical aspects of the original Therac-25 system.
* To apply software engineering principles and design patterns to improve the safety and reliability of the simulated system.
* To gain practical experience in designing and implementing safety-critical software.

## Background

The Therac-25 was a radiation therapy machine involved in several accidents in the 1980s due to software errors and inadequate safety mechanisms. These accidents resulted in patient deaths and injuries, highlighting the critical importance of software safety in medical devices.

## Safety Enhancements

This simulation incorporates several safety enhancements to mitigate the risks associated with the original Therac-25 design. These enhancements include:

* **Observer Pattern:** Implemented the Observer pattern to monitor and respond to critical events within the system. This allows for real-time monitoring and safety checks during operation.
* **Error Handling:** Improved error handling mechanisms to detect and prevent potential issues before they escalate into hazardous situations.
* **Data Validation:** Implemented data validation checks to ensure that input values are within safe and acceptable ranges.
* **Hardware/Software Interlocks:** Simulated hardware and software interlocks to prevent unsafe combinations of machine settings and operations.

## Design Patterns Used

* Observer Pattern
* [Add any other design patterns used in the project]

## How to Run the Simulation

1. Clone this repository to your local machine.
2. Ensure you have Java installed.
3. Compile the Java files.
4. Run the `TheracTestEnvironment` class to interact with the simulation.

## Project Status

This project is considered complete as it fulfilled the requirements of the computer systems concepts course. However, there is always room for further development and refinement of the safety features.

## Future Improvements

Potential future improvements for this project include:

* Adding a graphical user interface for easier interaction with the simulation.
* Implementing more advanced safety features, such as redundancy and fault tolerance mechanisms.
* Conducting formal verification and validation of the safety enhancements.
