              Library Management System
Library Management System Project Presentation & OOP Implementation Analysis

NAME: OWAIS
STUDENT ID: BTAI2023029
COURSE: B TECH AI (5TH SEM)
PROJECT: Library Management System
JAVA MENTOR: MR. NISHANT THAKUR
Project Overview
A Java-based application that simulates managing a library of books and magazines using Object-Oriented Programming principles.
Table of Contents
1. Project Introduction
2. Class Diagram & Structure
3. OOP Principles Implementation
4. Code Explanation
5. Key Features
6. Output Screenshots
7. Conclusion
Project Introduction
Objective
- Create a library management system to borrow and return items.
- Demonstrate OOP concepts in a real-world scenario.
- Implement interface and abstract class usage.
Technologies Used
- Java Programming Language
- OOP Principles
Class Diagram & Structure

┌─────────────────┐
│   Interface     │
│  Borrowable     │
├─────────────────┤
│ + borrowItem()  │
│ + returnItem()  │
└─────────────────┘
        △
        │ implements
┌─────────────────┐
│  Abstract Class │
│  LibraryItem    │
├─────────────────┤
│ - title         │
│ - author        │
│ - id            │
├─────────────────┤
│ + showDetails() │
│ + getters       │
└─────────────────┘
        △
        │ extends
 ┌──────────────┬──────────────┐
 │              │              │
▼               ▼              ▼
Book        Magazine       (future items)





OOP Principles Implementation
Abstraction
Hides details of borrow/return and shows only essential operations.
interface Borrowable {
    void borrowItem();
    void returnItem();
}
abstract class LibraryItem {
    public abstract void showDetails();
}
Encapsulation
Private data with getters.

String title, author, id;
boolean isBorrowed;
Inheritance
class Book extends LibraryItem implements Borrowable
class Magazine extends LibraryItem implements Borrowable
Polymorphism
Both Book and Magazine override showDetails().

LibraryItem[] catalog = {
    new Book("The Hobbit", "J.R.R. Tolkien", "B001", "Fantasy"),
    new Magazine("Time", "Time USA", "M002", 98)
};
Key Features
- Add multiple books and magazines
- Track borrowing status
- Borrow and return operations
- Menu system for user interaction
- Easy to add new items
Menu System Flow
LIBRARY MANAGEMENT SYSTEM

========= MENU =========
1. Show Items
2. Borrow Item
3. Return Item
4. Exit
Sample Code
LibraryItem[] catalog = {
    new Book("The Hobbit", "J.R.R. Tolkien", "B001", "Fantasy"),
    new Book("1984", "George Orwell", "B002", "Dystopian"),
    new Magazine("National Geographic", "NatGeo Society", "M001", 125),
    new Magazine("Time", "Time USA", "M002", 98)
};
Sample Output

Book: The Hobbit | Author: J.R.R. Tolkien | Genre: Fantasy | Status: Available
Book: 1984 | Author: George Orwell | Genre: Dystopian | Status: Available
Magazine: National Geographic | Publisher: NatGeo Society | Issue: 125 | Status: Available
Magazine: Time | Publisher: Time USA | Issue: 98 | Status: Available
Future Enhancements
1. Add more item types (Newspapers, Journals, eBooks)
2. User accounts with borrowing limits
3. Due date and fine system
4. Database storage for catalog
5. GUI interface
Conclusion
Successfully implemented OOP principles.
Created extensible library system.
Demonstrated interfaces and abstract classes.
Built a simple user-friendly program.
Learning Outcomes
1. Interface implementation
2. Abstract classes for shared properties
3. Inheritance to extend functionality
4. Polymorphism for flexible behavior
5. Encapsulation to protect states
