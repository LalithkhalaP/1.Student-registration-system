# 1.Student-registration-system
Objective:
To build a simple Java console application where a user enters student details and the system stores them into a database using JDBC.
Description:
This mini-project collects student name, roll number, and department through Java console input and saves them into a database table (students). It demonstrates basic JDBC operations such as Driver loading, Connection creation, PreparedStatement execution, and inserting data securely.
Requirements:
Java:
Scanner for console input
Class.forName() to load driver
Connection, PreparedStatement
JDBC Concepts:
INSERT query
PreparedStatement to prevent SQL injection
Auto-commit usage
SQL Table:
students(id INT AUTO_INCREMENT, name VARCHAR(50), roll INT, dept VARCHAR(50))
