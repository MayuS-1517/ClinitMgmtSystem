# 🏥 Clinic Management System (Java Console + JDBC)

A simple console-based Java application to manage patient records in a clinic. It demonstrates basic CRUD operations using Core Java, OOP principles, and JDBC for database interaction.

---

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


