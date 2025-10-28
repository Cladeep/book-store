# Java Library Management Exercise

## 📖 Overview

Welcome to the Java Library Management exercise! In this project, you will build a simple library management system. This exercise is designed to help you practice core Java concepts, including object-oriented programming (OOP), collections, and tests.

The main goal is to implement the required classes and methods to make all the tests in `BookTest.java` pass.

## ✅ Getting Started

1.  **Familiarize yourself with the project structure.** The main source code is in `src/main/java`, and the tests are in `src/test/java`.
2.  **Run the tests.** Open a terminal in the project root and run the tests to see what is already working and what needs to be implemented.
    ```bash
    mvn test
    ```
3.  **Implement the requirements.** Follow the requirements below to implement the `Library`, `Ebook`, and `PaperBook` classes.
4.  **Test your code.** As you implement each feature, run the tests again to ensure that your code is working correctly.

## 📚 The `Book` Class (Already Implemented)

The `Book` class in `src/main/java/Book.java` serves as the base class for all books in the library. It is already implemented for you and has the following properties:

*   `title` (String)
*   `author` (String)
*   `isbn` (String): The International Standard Book Number, a unique identifier for the book.

## 🛠️ Requirements

Your goal is to implement the following classes and methods to make all the tests in `BookTest.java` pass.

### The `Library` Class

Create a class named `Library` in `src/main/java/Library.java` that will manage a collection of `Book` objects. It should have the following methods:

*   `addBook(Book book)`: Adds a book to the library's collection.
*   `removeBook(String isbn)`: Removes a book from the collection, identified by its `isbn`.
*   `listBooks()`: Returns a list of all books currently in the library.
*   `getBooksByAuthor(String author)`: Returns a list of all books written by a specific author.

### Inheritance: `Ebook` and `PaperBook`

Create two new classes that inherit from `Book`:

*   **`Ebook`**: This class should be in `src/main/java/Ebook.java` and have an additional property:
    *   `fileSize` (int): The size of the ebook file in megabytes (MB).
*   **`PaperBook`**: This class should be in `src/main/java/PaperBook.java` and have an additional property:
    *   `weight` (int): The weight of the book in grams.

## 🚀 Git & GitHub Instructions

This exercise is also an opportunity to practice your Git and GitHub skills.

1.  **Initialize a new Git repository:**
    ```bash
    git init
    ```
2.  **Add all files to the staging area:**
    ```bash
    git add .
    ```
3.  **Commit the initial state of the project:**
    ```bash
    git commit -m "Initial commit"
    ```
4.  **Create a new private repository on GitHub:**
    Go to [https://github.com/new](https://github.com/new) and create a new **private** repository. Do not initialize it with a README, .gitignore, or license.
5.  **Link your local repository to the remote one:**
    Replace `<repository_url>` with the URL of your new GitHub repository.
    ```bash
    git remote add origin <repository_url>
    ```
6.  **Push your code to GitHub:**
    This command pushes your `main` branch to the remote repository.
    ```bash
    git push -u origin main
    ```

As you complete each requirement, remember to commit your changes. This is a great way to track your progress and build a professional portfolio.
