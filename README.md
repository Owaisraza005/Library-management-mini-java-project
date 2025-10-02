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
