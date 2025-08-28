# Copilot Instructions for hello-lib Java Library

This is a Maven-based Java library project (`hello-lib`) using Java 21 and JUnit 5. The main purpose is to provide a simple `HelloWorld` class for demonstration and testing.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Prerequisites
- **CRITICAL**: Ensure JAVA_HOME is set to Java 21: `export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64`
- Install Java 21 if not available: `sudo apt update && sudo apt install -y openjdk-21-jdk`
- Set Java 21 as default: `sudo update-alternatives --set java /usr/lib/jvm/java-21-openjdk-amd64/bin/java`
- Set javac 21 as default: `sudo update-alternatives --set javac /usr/lib/jvm/java-21-openjdk-amd64/bin/javac`

### Build Commands (Always set JAVA_HOME first)
All commands must be run from the repository root with JAVA_HOME set:
```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
```

- **Clean build**: `mvn clean` -- takes ~5 seconds. Timeout: 30 seconds.
- **Compile**: `mvn compile` -- takes ~2 seconds. Timeout: 30 seconds. NEVER CANCEL.
- **Run tests**: `mvn test` -- takes ~8 seconds. Timeout: 60 seconds. NEVER CANCEL.
- **Package JAR**: `mvn package` -- takes ~5 seconds. Timeout: 60 seconds. NEVER CANCEL.
- **Full clean package**: `mvn clean package` -- takes ~3 seconds. Timeout: 60 seconds. NEVER CANCEL.

### Run Applications
- **Run App class**: `java -cp target/classes com.example.hello.App`
- **Test HelloWorld functionality**: Create test class and run with classpath including target/classes

### Validation
- Always test functionality after making changes by running: `mvn clean package`
- Test the App class: `java -cp target/classes com.example.hello.App` (should print "Hello World!")
- Test HelloWorld class by creating a simple test that instantiates it and calls `hello()` method
- Verify tests pass: `mvn test` (should show "Tests run: 2, Failures: 0, Errors: 0, Skipped: 0")

## Repository Structure
```
.
├── .git/
├── .github/
│   └── copilot-instructions.md
├── .gitignore               # Comprehensive gitignore for Java/Maven/IDEs
├── README.md                # Basic usage documentation
├── pom.xml                  # Maven configuration with Java 21, JUnit 5, compiler/surefire plugins
├── src/
│   ├── main/java/com/example/hello/
│   │   ├── App.java         # Simple main class (Maven archetype default)
│   │   └── HelloWorld.java  # Main library class with hello() method
│   └── test/java/com/example/hello/
│       ├── AppTest.java     # Basic test for App class
│       └── HelloWorldTest.java # JUnit 5 test for HelloWorld
└── target/                  # Build output directory (gitignored)
```

## Key Files & Configuration
- **pom.xml**: Maven config with Java 21, JUnit 5.9.3, maven-compiler-plugin 3.13.0, maven-surefire-plugin 3.2.5
- **HelloWorld.java**: Main library class. Method `String hello()` returns "Hello, World!"
- **HelloWorldTest.java**: JUnit 5 test using `@Test` and `assertEquals`
- **App.java**: Simple main method that prints "Hello World!" (archetype default, not core library logic)

## Development Patterns
- All source code goes in `src/main/java/com/example/hello/`
- All tests go in `src/test/java/com/example/hello/`
- Use JUnit 5 (`org.junit.jupiter.api`) for tests: `@Test` annotation, assertions from `org.junit.jupiter.api.Assertions`
- Follow Maven standard directory layout
- The project is a library; App class is demonstration only

## Troubleshooting
- **Build fails with "invalid target release: 21"**: Ensure JAVA_HOME is set to Java 21 before running Maven
- **Maven not finding Java 21**: Install openjdk-21-jdk and set alternatives as shown in prerequisites
- **Tests not running**: Ensure maven-surefire-plugin is configured in pom.xml (version 3.2.5)
- **Compilation warnings about encoding**: This is normal, build uses UTF-8 platform encoding

## Common Operations
- **Add new library feature**: Create class in `src/main/java/com/example/hello/`, add corresponding test in `src/test/java/com/example/hello/`
- **Add dependencies**: Update `<dependencies>` section in pom.xml, run `mvn clean compile`
- **Verify everything works**: Run `mvn clean package` and test the generated JAR

## Example Usage
```java
HelloWorld hw = new HelloWorld();
System.out.println(hw.hello()); // Prints: "Hello, World!"
```

## Timing Expectations (NEVER CANCEL these operations)
- First-time Maven dependency download: ~30-60 seconds
- Clean build from scratch: ~3-8 seconds
- Incremental compile: ~1-2 seconds
- Test execution: ~8 seconds
- Package creation: ~5 seconds

All build and test commands should complete within 60 seconds. Set timeouts accordingly and NEVER CANCEL running builds or tests.
