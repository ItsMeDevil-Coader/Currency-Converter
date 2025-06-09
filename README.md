
# 💱 Java Currency Converter

A **Java-based Currency Converter** application with a GUI, backed by **MySQL**, and structured using **DAO**, **Model**, **UI**, and **Util** layers. It supports basic CRUD operations for currency data, built with JDBC for database interaction.

---

## 📁 Project Structure

```
Currency Converter/
├── dao/        # Data Access Object - Handles DB operations
├── model/      # Model classes - Currency entity, etc.
├── ui/         # User Interface - Java Swing GUI components
├── util/       # Utility classes - JDBC connection, validation
├── ModernCurrencyConverter.sql  # SQL file to create necessary tables
├── README.md   # Project documentation
```

---

## 🚀 Features

- Convert between multiple currencies
- Manage currency records (add, update, delete)
- Java Swing-based GUI
- JDBC-based MySQL connectivity
- Layered architecture for modular design

---

## 🧰 Technologies Used

- Java (JDK 8+)
- JDBC
- MySQL
- Java Swing (GUI)

---

## 🧱 Folder Flow Explanation

| Folder | Purpose |
|--------|---------|
| `dao/` | Contains classes for interacting with the database (CRUD). |
| `model/` | Includes currency model classes (POJOs). |
| `ui/` | Contains all the GUI-related code using Java Swing. |
| `util/` | Holds utility classes like database connection and common helpers. |

---

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Currency-Converter.git
   cd Currency-Converter
   ```

2. Import the SQL file into your MySQL database:
   ```sql
   SOURCE ModernCurrencyConverter.sql;
   ```

3. Update DB credentials in the `util/DBConnection.java` file.

4. Compile and run the application:
   ```bash
   javac -d bin $(find . -name "*.java")
   java -cp bin ui.MainFrame
   ```

---


## 📌 Author
- [GitHub Profile-https://github.com/ItsMeDevil-Coader/Currency-Converter/
---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
