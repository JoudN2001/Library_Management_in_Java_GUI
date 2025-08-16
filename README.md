# Library Management System 📚

## 📖 Description

This is a desktop-based **Library Management System** developed as a university project. The application provides a graphical user interface (GUI) for librarians to manage a collection of books. It features a secure login system and core functionalities for book management, including adding, updating, deleting, and viewing book records.

The system is built using **Java Swing** for the front-end and connects to an **Apache Derby** database for data persistence, demonstrating a practical application of database connectivity (JDBC) in a desktop environment.

---

## ✨ Features

* **User Authentication**: Secure login screen to ensure only authorized users can access the management panel.
* **Book Management (CRUD)**:
    * **Add**: Add new books with details like ID, Title, Author, Publisher, and Price.
    * **Update**: Modify the information of existing books.
    * **Delete**: Remove books from the database using their ID.
    * **View**: Display all book records in a clear, sortable table.
* **Dynamic Search**: A live search functionality that filters the book list as you type in the title field, allowing for quick and easy lookups.
* **Database Integration**: Robust connection to a backend database to store and retrieve library data persistently.

---

## 🛠️ Technologies Used

* **Programming Language**: **Java**
* **GUI Framework**: **Java Swing** for building the desktop interface.
* **Database**: **Apache Derby (Java DB)** for data storage.
* **Database Connectivity**: **JDBC (Java Database Connectivity)** API.
* **IDE**: NetBeans (as indicated by the project structure and `.form` files).
* **Libraries**:
    * `rs2xml.jar`: To help populate the `JTable` with data from the database `ResultSet`.

---

## ⚙️ Setup and Installation

To run this project, you will need to have the Java Development Kit (JDK) and Apache Derby database installed.

### 1. Database Setup

1.  **Start the Apache Derby Network Server**.
2.  Create a database named `libraryAdmin`.
3.  Connect to the database using the credentials:
    * **Username**: `libraryAdmin`
    * **Password**: `2001`
4.  Execute the following SQL scripts to create the necessary tables:

    ```sql
    -- Table for user accounts
    CREATE TABLE LIBRARYADMIN.ACCOUNTS (
        username VARCHAR(255) NOT NULL PRIMARY KEY,
        password VARCHAR(255) NOT NULL,
        name VARCHAR(255)
    );

    -- Table for book records
    CREATE TABLE LIBRARYADMIN.BOOKS (
        ID INT NOT NULL PRIMARY KEY,
        Title VARCHAR(255),
        Author VARCHAR(255),
        Publisher VARCHAR(255),
        Price DOUBLE
    );

    -- Insert a sample admin user for login
    INSERT INTO LIBRARYADMIN.ACCOUNTS (username, password, name) VALUES ('admin', 'admin123', 'Administrator');
    ```

### 2. Project Setup

1.  Clone or download the project repository.
2.  Open the project in an IDE like NetBeans.
3.  Ensure the `rs2xml.jar` library is included in the project's classpath. The project properties point to its location.
4.  The JDBC driver for Derby should also be included in the classpath.
5.  Build and run the project. The main entry point is the `loginMenu.java` file, which will launch the login window.

---

## 🚀 Usage

1.  Launch the application.
2.  You will be greeted with the **Log In Frame**. Enter valid credentials (e.g., the sample admin user you created) to log in.
3.  Upon successful login, the **Book Management** window will appear.
4.  You can now perform the following actions:
    * **To Add a Book**: Fill in all the text fields and click the "Add" button.
    * **To Delete a Book**: Enter the ID of the book you want to remove and click the "Delete" button.
    * **To Update a Book**: Enter the ID of the book to update, fill in the new details in the other fields, and click the "Update" button.
    * **To View All Books**: Click the "Show All Data" button to refresh and display the entire book list.
    * **To Search**: Simply start typing in the "Title" text field, and the table will filter the results automatically.

---

## 👨‍💻 Author

* **JoudN** - A Computer Science student passionate about software development and database management.
