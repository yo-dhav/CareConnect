Symphony Care 🏥
Symphony Care is an AI-powered healthcare assistant designed to streamline the medical appointment booking process. Using a conversational interface, it identifies patient symptoms, matches them with the appropriate medical specialist, and schedules appointments directly into a MySQL database.

🚀 Features
Intelligent Symptom Detection: Automatically maps symptoms (e.g., "chest pain") to the correct specialist (e.g., "Cardiologist").

Conversational UI: A sleek, user-friendly chat interface with glassmorphism design.

Smart Parsing: Understands natural language dates like "Tomorrow" or "Next Friday".

Session Management: Tracks individual user conversations using unique Session IDs.

Persistent Storage: Full integration with MySQL to store patient records.

🛠️ Tech Stack
Backend: Java 17, Spring Boot 4.0.1

Frontend: HTML5, CSS3, Vanilla JavaScript

Database: MySQL

Build Tool: Maven

📋 Prerequisites
Before running the project, ensure you have the following installed:

Java JDK 17 or higher

MySQL Server

A modern web browser (Chrome/Edge/Firefox)

🔧 Setup & Installation
1. Clone the repository:

Bash
git clone <your-repository-url>
cd CareConnect
2. Database Setup:
Execute the following SQL commands in your MySQL terminal or Workbench to create the database and table:

SQL
CREATE DATABASE careconnect;
USE careconnect;

CREATE TABLE appointment (
  id INT AUTO_INCREMENT PRIMARY KEY,
  patient_name VARCHAR(100),
  specialization VARCHAR(100),
  date VARCHAR(20),
  time VARCHAR(20)
);
3. Configure Database Credentials:
Open src/main/resources/application.properties and update your MySQL username and password to match your local setup:

Properties
spring.datasource.url=jdbc:mysql://localhost:3306/careconnect
spring.datasource.username=your_username
spring.datasource.password=your_password
4. Run the Backend:
Using the Maven Wrapper, start the Spring Boot server (it will run on port 8095):

Bash
./mvnw spring-boot:run
(For Windows Command Prompt, use mvnw.cmd spring-boot:run)

5. Launch the Frontend:
Simply open index.html in your web browser to start chatting with the assistant!

📸 Screenshots
(Create a folder named screenshots in your project root, add your images, and remove the HTML comment arrows `` below to display them)