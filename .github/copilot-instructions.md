---
# Copilot Instructions for hello-lib Java Library

## Project Overview
This is a Maven-based Java library project (`hello-lib`) using Java 21 and JUnit 5. The main purpose is to provide a simple `HelloWorld` class for demonstration and testing.

## Key Files & Structure
- `pom.xml`: Maven configuration. Java 21 is set via `<maven.compiler.source>` and `<maven.compiler.target>`. JUnit 5 is used for tests.
- `src/main/java/com/example/hello/HelloWorld.java`: Main library class. Method: `String hello()` returns "Hello, World!".
- `src/test/java/com/example/hello/HelloWorldTest.java`: JUnit 5 test for `HelloWorld`.
- `README.md`: Usage, build, and test instructions.

## Pre-requisites
- Java 21 JDK
- Apache Maven 3.8.1 or higher
- CRITICAL: 
  - **CRITICAL**: Ensure JAVA_HOME is set to Java 21
  - Install Java 21 if not available

## Build & Test Workflow
- **Build:**
  - Run `mvn compile` in the `hello-lib` directory.
- **Test:**
  - Run `mvn test` to execute all JUnit 5 tests.
- **Debug:**
  - Use standard Java debugging tools. No custom debug configuration is present.

## Patterns & Conventions
- All source code is under `src/main/java/com/example/hello/`.
- All tests are under `src/test/java/com/example/hello/`.
- JUnit 5 (`org.junit.jupiter.api`) is used for all tests. Use `@Test` annotation and assertions from `org.junit.jupiter.api.Assertions`.
- The project is a library; the `App` class is a Maven archetype default and not used for library logic.

## Integration Points
- No external dependencies except JUnit 5 for testing.
- No service boundaries, data flows, or cross-component communication; the project is a single-module library.

## Example Usage
```java
HelloWorld hw = new HelloWorld();
System.out.println(hw.hello()); // "Hello, World!"
```

## Quickstart for AI Agents
- To add new features, create classes in `src/main/java/com/example/hello/` and corresponding tests in `src/test/java/com/example/hello/`.
- Update `pom.xml` for new dependencies if needed.
- Always verify with `mvn test`.

---
If any section is unclear or missing, please provide feedback for further refinement.
