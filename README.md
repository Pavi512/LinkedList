# Linked List

A Java console-based application that demonstrates the implementation of Linked Lists using Object-Oriented Programming and Java Generics. The project progressively implements various Linked List operations, including insertion, deletion, searching, updating, and sorting through multiple use cases. Each enhancement is developed in a dedicated feature branch and merged into the development branch using a Git feature branch workflow.

---

## About the Project

A Linked List is a dynamic linear data structure where elements are stored in nodes connected through references. Unlike arrays, Linked Lists allow efficient insertion and deletion operations without requiring contiguous memory allocation.

This project demonstrates the implementation of both Unordered and Ordered Linked Lists using Java Generics. Starting from creating a simple Linked List, the project gradually introduces operations such as adding elements at different positions, deleting nodes, searching, inserting after a specific node, calculating the size of the list, and finally implementing a Sorted Linked List that maintains elements in ascending order.

The implemented use cases are based on the BridgeLabz Data Structure using Java Generics module and are developed incrementally using a Git feature branch workflow.

---

## Topics Covered

- Linked List
- Java Generics
- Node Creation
- Insertion
- Deletion
- Searching
- Sorting
- Object-Oriented Programming

---

## Project Highlights

- Custom Linked List implementation
- Generic Node implementation
- Ordered and Unordered Linked Lists
- Searching and deletion operations
- Sorted Linked List
- Feature branch Git workflow
- Clean and modular Java code

---

## Use Cases Implemented

| Use Case | Description |
|----------|-------------|
| UC1 | Create a simple Linked List with nodes 56, 30, and 70 |
| UC2 | Create a Linked List using addFirst() |
| UC3 | Append elements using addLast() |
| UC4 | Insert an element at a specific position |
| UC5 | Delete the first element using pop() |
| UC6 | Delete the last element using popLast() |
| UC7 | Search for a particular element in the Linked List |
| UC8 | Insert an element after a specified node |
| UC9 | Delete a specified element and display the size of the Linked List |
| UC10 | Implement a Sorted Linked List using Java Generics |

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Generics
- Linked List
- Data Structures and Algorithms
- Git
- GitHub

---

## Project Structure

```text
LinkedList/
│
├── src/
│   └── com/
│       └── bridgelabz/
│           └── linkedlist/
│               ├── LinkedListMain.java
│               └── SortedLinkedList.java
│
├── README.md
└── .gitignore
```

---

## Objectives

- Understand the Linked List data structure.
- Learn insertion and deletion operations.
- Implement searching and updating operations.
- Create Ordered and Unordered Linked Lists.
- Use Java Generics for reusable data structures.
- Strengthen problem-solving skills using Linked Lists.

---

## How to Run

### Clone the Repository

```bash
git clone https://github.com/Pavi512/LinkedList.git
```

### Navigate to the Project Directory

```bash
cd LinkedList
```

### Compile

```bash
javac src/com/bridgelabz/linkedlist/*.java
```

### Run

```bash
java com.bridgelabz.linkedlist.LinkedListMain
```

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Insert at Beginning | O(1) |
| Insert at End | O(n) |
| Insert at Position | O(n) |
| Delete First | O(1) |
| Delete Last | O(n) |
| Search | O(n) |
| Delete Specific Node | O(n) |
| Size | O(n) |
| Sorted Insert | O(n) |

---

## Git Workflow

The project follows a feature branch workflow.

- `main` – Initial project setup
- `dev` – Development branch
- `feature/UC1-UC2`
- `feature/UC3`
- `feature/UC4`
- `feature/UC5`
- `feature/UC6`
- `feature/UC7`
- `feature/UC8`
- `feature/UC9`
- `feature/UC10`

Each feature branch introduces a new Linked List operation. After implementation and testing, the feature branch is merged into the `dev` branch, ensuring incremental development and a clean Git history.

---

## Learning Outcomes

After completing this project, you will be able to:

- Understand Linked List concepts and operations.
- Implement insertion, deletion, searching, and updating operations.
- Build Ordered and Unordered Linked Lists.
- Apply Java Generics for reusable implementations.
- Analyze the time complexity of Linked List operations.
- Apply Object-Oriented Programming principles.
- Follow Git feature branch development practices.

---

## Repository

This repository demonstrates the step-by-step implementation of Linked List operations using Java. Each use case extends the previous implementation by introducing new functionalities, making it a valuable resource for learning Data Structures, Java Generics, and Object-Oriented Programming.

---

## License

This project is intended for educational and learning purposes.

---

## Author

**Gondi Pavithra**

GitHub: https://github.com/Pavi512
