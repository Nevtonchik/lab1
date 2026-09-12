# Laboratory Work 1

**Student:** Kulchinskiy Arseni<br>
**Group:** 25 DCK<br>
**Project:** `lab01-hello-maven`

## Description

A basic Java 25 Maven project created in IntelliJ IDEA.
The application uses Apache Commons Lang to format a personalized greeting.

## Technology stack

- Java 25
- Apache Maven
- Apache Commons Lang 3.20.0
- Git and GitHub

## Project structure

```text
lab01-hello-maven/
├── .gitignore
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            └── by/bseu/kulchinskiy/lab01/
                └── HelloApplication.java
```

## How to run

Open the project in IntelliJ IDEA with JDK 25 and run `HelloApplication.main()`.

Expected output:

```text
Hello, Kulchinskiy Arseni!
My first Maven project works!
```

## Dependency

The external library is declared in `pom.xml` and used in the application through
`org.apache.commons.lang3.StringUtils.capitalize`.
