# 🏥 Clinic Management System (Java Console + JDBC)

A simple console-based Java application to manage patient records in a clinic. It demonstrates basic CRUD operations using Core Java, OOP principles, and JDBC for database interaction.

---

## Group Member
1.Mayuri Vijay Surve
2.Pragati Santosh Gore
3.Vaishnavi Prashant Shete

## 📌 Features

- ✅ Add new patient
- ✅ View all patients
- ✅ Console-based menu system
- ✅ Connected to PostgreSQL using JDBC

---

## 🛠 Technologies Used

| Technology   | Description                       |
|--------------|-----------------------------------|
| Java         | Core Java (OOP concepts)          |
| JDBC         | Java Database Connectivity        |
| PostgreSQL   | Relational database               |
| Git & GitHub | Version control and code hosting  |

---

## 🧾 Database Table

```sql
CREATE TABLE patient (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    disease VARCHAR(100)
);```

## 🧾 Project Structure
```/clinic-management
│
├── DBConnection.java       # Handles database connection
├── PatientDAO.java         # Handles patient-related DB operations
└── Main.java               # Contains main menu and user input```


⚙ How to Run

Clone the repository

git clone https://github.com/YourUsername/clinic-management.git
Set up PostgreSQL and create the patient table as shown above.

Update your DB credentials in DBConnection.java.

Compile and run:

javac Main.java
java Main

## 🧾 contact
Name:Mayuri Surve
email:mayurusurve1517@gmai.com


