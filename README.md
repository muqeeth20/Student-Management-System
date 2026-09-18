# 🎓 Student Management System

<p align="center">

### 📚 A Simple & Modular Student Record Management Application Built with Java

A console-based application designed to manage **student records, courses, marks, and academic results** using Java Object-Oriented Programming principles.

</p>

---

## 🌟 Overview

The **Student Management System** is a menu-driven Java application that simplifies basic student record management.

The system allows users to add, search, update, and delete student records while also supporting course and marks management with percentage and grade calculation.

The project follows a **modular multi-class structure**, where different classes handle specific responsibilities.

---

## ✨ Features

| Feature                       | Description                        |
| ----------------------------- | ---------------------------------- |
| 👤 **Student Management**     | Add and manage student information |
| 🔎 **Student Search**         | Search students using Student ID   |
| ✏️ **Update Records**         | Update student details             |
| 🗑️ **Delete Records**        | Remove student records             |
| 📚 **Course Management**      | Add courses and marks              |
| 📊 **Marks Calculation**      | Calculate academic performance     |
| 📈 **Percentage Calculation** | Calculate average percentage       |
| 🏆 **Grade Classification**   | Automatically determine grades     |
| 🛡️ **Input Validation**      | Validate user-provided information |

---

## 🛠️ Technologies Used

```text
☕ Java
🧱 Object-Oriented Programming
📋 ArrayList
⌨️ Scanner
🔄 Loops & Conditional Statements
🛡️ Input Validation
```

---

## 🧠 Java Concepts Demonstrated

This project demonstrates practical implementation of:

* ✅ Classes & Objects
* ✅ Constructors
* ✅ Encapsulation
* ✅ Getters & Setters
* ✅ Methods
* ✅ ArrayList
* ✅ Loops
* ✅ Conditional Statements
* ✅ Switch-Case
* ✅ Input Validation
* ✅ Modular Programming

---

## 📂 Project Structure

```text
Student-Management-System/
│
├── 📄 Main.java
├── 📄 Student.java
├── 📄 StudentManager.java
├── 📄 Course.java
├── 📄 Result.java
├── 📄 Utils.java
├── 📄 .gitignore
└── 📄 README.md
```

### 📌 Class Responsibilities

#### `Main.java`

Handles the menu-driven interface, user input, and application flow.

#### `Student.java`

Represents a student and stores personal and academic-related information.

#### `StudentManager.java`

Manages student records using `ArrayList` and provides search, update, delete, and display operations.

#### `Course.java`

Represents course information and stores marks obtained by the student.

#### `Result.java`

Handles course records and calculates percentage and grade based on marks.

#### `Utils.java`

Provides reusable methods for input validation.

---

## 🔄 Application Workflow

```text
                    🎓 Student
                        │
                        ▼
                ➕ Add Student
                        │
                        ▼
             📋 Student Record
                        │
          ┌─────────────┼─────────────┐
          ▼             ▼             ▼
       🔎 Search      ✏️ Update      🗑️ Delete
          │             │             │
          └─────────────┼─────────────┘
                        ▼
                 📚 Add Courses
                        │
                        ▼
                  📝 Enter Marks
                        │
                        ▼
                 📊 Calculate %
                        │
                        ▼
                  🏆 Calculate Grade
```

---

## 🖥️ Application Menu

```text
====================================
       STUDENT MANAGEMENT SYSTEM
====================================

1. Add Student
2. Search Student
3. Update Student
4. Delete Student
5. Display All Students
6. Add Course & Marks
7. Display Result
8. Exit

Enter your choice:
```

---

## 📊 Result Calculation

The system calculates the student's average percentage based on the marks entered.

### Example

```text
Java           : 85
Data Structures: 90
DBMS           : 80
```

### Calculation

```text
Total = 85 + 90 + 80
      = 255

Percentage = 255 / 3
           = 85%
```

### Grade

```text
85% → A
```

---

## 🛡️ Input Validation

The application performs basic validation for reliable record management.

```text
✔ Validates student name
✔ Validates student age
✔ Validates phone number
✔ Validates marks between 0–100
✔ Checks whether Student ID exists
✔ Prevents operations on unavailable records
```

---

## 🚀 Getting Started

### Prerequisites

Install Java JDK on your system.

Check Java:

```bash
java --version
```

Check Java compiler:

```bash
javac --version
```

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the repository

```bash
git clone https://github.com/muqeeth20/Student-Management-System.git
```

### 2️⃣ Navigate to the project

```bash
cd Student-Management-System
```

### 3️⃣ Compile the project

```bash
javac *.java
```

### 4️⃣ Run the application

```bash
java Main
```

---

## 🎯 Learning Outcomes

Through this project, I practiced:

* Building a multi-class Java application
* Applying Object-Oriented Programming principles
* Managing dynamic records using `ArrayList`
* Implementing CRUD-style operations
* Designing reusable methods
* Performing academic calculations
* Validating user input
* Organizing code using modular architecture
* Using Git and GitHub for version control

---

## 🔮 Future Enhancements

Possible improvements for future versions:

* 🗄️ **Database Integration** — MySQL/Oracle
* 🔐 **Student Login System**
* 📊 **Advanced Performance Analytics**
* 📄 **Report Card Generation**
* 📈 **Subject-wise Performance Reports**
* 💾 **Persistent Data Storage**
* 🖥️ **GUI using Java Swing/JavaFX**
* 🌐 **Web-based Student Portal**

---

## 📊 Project Highlights

```text
Language        : Java ☕
Application     : Console Based 🖥️
Architecture    : Modular OOP 🧱
Data Structure  : ArrayList 📋
Operations      : CRUD 🔄
Validation      : Implemented 🛡️
Version Control : Git + GitHub 🚀
Status          : Completed ✅
```

---

## 👨‍💻 Author

### **Muqeeth**

🎓 B.Tech — Information Technology

💻 Aspiring Software Developer

---

## ⭐ Support

If you found this project useful for learning Java and OOP concepts, consider giving the repository a ⭐ on GitHub!

---

> **"Learn by building. Build by improving. 🚀"**
