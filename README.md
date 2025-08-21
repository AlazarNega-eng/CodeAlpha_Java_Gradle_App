# CodeAlpha_Java_Gradle_App
# Java Command-Line Calculator with Gradle

This repository contains a simple yet robust command-line calculator built with Java. The project is managed and built using Gradle and includes a full suite of unit tests with JUnit 5.

![Java CI with Gradle](https://github.com/AlazarNega-eng/CodeAlpha_Java_Gradle_App/actions/workflows/build-pipeline.yml/badge.svg)

## 📋 Project Overview

This project was created to fulfill Task 3 of the CodeAlpha DevOps Internship. It demonstrates proficiency in:
*   Java application development.
*   Dependency management and automated builds with Gradle.
*   Test-driven development (TDD) principles using JUnit 5.
*   Continuous Integration (CI) using GitHub Actions.

## ✨ Features

*   Performs basic arithmetic operations: addition, subtraction, multiplication, and division.
*   Handles invalid inputs and edge cases like division by zero.
*   Fully automated build and test process.

## 🛠️ Technologies & Tools Used

*   **Language:** Java 17
*   **Build Tool:** Gradle 7.5
*   **Testing Framework:** JUnit 5 (Jupiter)
*   **CI/CD:** GitHub Actions

## 🚀 Getting Started

### Prerequisites

*   Java Development Kit (JDK) 17 or later must be installed.

### Building the Project

You do not need to install Gradle manually. Use the provided Gradle Wrapper (`gradlew`).

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/AlazarNega-eng/CodeAlpha_Java_Gradle_App.git
    cd CodeAlpha_Java_Gradle_App
    ```

2.  **Build and run tests:**
    This command compiles the code, runs all unit tests, and packages the application into an executable JAR file located in `build/libs/`.
    ```sh
    # For macOS/Linux
    ./gradlew build

    # For Windows
    .\gradlew build
    ```
    A detailed test report can be found at `build/reports/tests/test/index.html` after the build is complete.

### Running the Application

There are two ways to run the command-line calculator:

1.  **Using the Gradle `run` task:**
    ```sh
    # For macOS/Linux
    ./gradlew run --args='<num1> <operator> <num2>'

    # For Windows
    .\gradlew run --args='<num1> <operator> <num2>'
    ```
    **Example:**
    ```sh
    ./gradlew run --args='99 + 1'
    ```

2.  **Using the generated JAR file:**
    First, ensure you have built the project with `./gradlew build`.
    ```sh
    java -jar build/libs/CodeAlpha_Java_Gradle_App.jar <num1> <operator> <num2>
    ```
    **Example:**
    ```sh
    java -jar build/libs/CodeAlpha_Java_Gradle_App.jar 100 / 25
    ```

## ⚙️ CI/CD Pipeline

This project uses **GitHub Actions** for its Continuous Integration pipeline. The workflow is defined in the `.github/workflows/build-pipeline.yml` file and performs the following steps on every push to the `main` branch:

1.  **Checkout Code:** Clones the repository onto the runner.
2.  **Set up JDK 17:** Installs the correct Java version.
3.  **Build with Gradle:** Executes the `./gradlew build` command to compile and test the code.
4.  **Upload Artifacts:** If the build is successful, it uploads the generated JAR file and test reports as artifacts, which can be downloaded from the GitHub Actions summary page.

---
*This project was completed as part of the CodeAlpha DevOps Internship program.*
