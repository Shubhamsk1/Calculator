
# StringCalculator

A simple implementation of a `StringCalculator` that supports adding numbers from a string input, along with features like custom delimiters, handling newlines, and throwing exceptions for negative numbers.


## Requirements
- Java 21 
- Maven 3.x 
- JUnit 5 


## How to Build and Run

### 1. Clone the Repository

```bash
git clone https://github.com/Shubhamsk1/Calculator.git
cd Calculator
```

### 2. Build the Project Using Maven

To build the project, run the following command:

```bash
mvn clean install
```

### 3. Run the Tests

To run all tests, execute:

```bash
mvn test
```


## Dependencies

- **JUnit 5**: For running tests.

## Maven Configuration (`pom.xml`)

The project uses Maven for dependency management. Below is the relevant snippet for the JUnit 5 dependency:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```


