# Library Management System

## Objective
The Library Management System is a simple application that allows users to manage library operations such as adding books, borrowing books, returning books, and viewing available books. This project was developed using Test-Driven Development (TDD) principles in Java 17 with IntelliJ IDEA.

## Features
- **Add Books**: Users can add new books to the library with unique identifiers (ISBN), titles, authors, and publication years.
- **Borrow Books**: Users can borrow books if they are available. The system checks availability before allowing the transaction.
- **Return Books**: Users can return borrowed books, updating their availability status in the library.
- **View Available Books**: Users can view a list of all books currently available in the library.

## Requirements
- Java 17
- Maven (for dependency management)
- JUnit (for testing)

## Getting Started

### Prerequisites
- Install [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).
- Install [Maven](https://maven.apache.org/download.cgi).
- Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) (or any Java IDE of your choice).

### Clone the Repository
```bash
git clone https://github.com/yourusername/library-management-system.git
cd library-management-system
