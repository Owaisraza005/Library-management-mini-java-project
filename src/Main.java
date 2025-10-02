import java.util.Scanner;

interface Borrowable {
    void borrowItem();
    void returnItem();
}

abstract class LibraryItem {
    String title, author, id;

    LibraryItem(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    abstract void showDetails();
}

class Book extends LibraryItem implements Borrowable {
    boolean isBorrowed;
    String genre;

    Book(String title, String author, String id, String genre) {
        super(title, author, id);
        this.genre = genre;
        this.isBorrowed = false;
    }

    public void showDetails() {
        System.out.println("Book: " + title + " | Author: " + author + " | Genre: " + genre + " | Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }

    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " borrowed!");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " returned!");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}

class Magazine extends LibraryItem implements Borrowable {
    boolean isBorrowed;
    int issue;

    Magazine(String title, String publisher, String id, int issue) {
        super(title, publisher, id);
        this.issue = issue;
        this.isBorrowed = false;
    }

    public void showDetails() {
        System.out.println("Magazine: " + title + " | Publisher: " + author + " | Issue: " + issue + " | Status: " + (isBorrowed ? "Borrowed" : "Available"));
    }

    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " Issue " + issue + " borrowed!");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " Issue " + issue + " returned!");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryItem[] catalog = {
                new Book("The Hobbit", "J.R.R. Tolkien", "B001", "Fantasy"),
                new Book("1984", "George Orwell", "B002", "Dystopian"),
                new Magazine("National Geographic", "NatGeo Society", "M001", 125),
                new Magazine("Time", "Time USA", "M002", 98)
        };

        while (true) {
            System.out.println("\n1. Show Items\n2. Borrow Item\n3. Return Item\n4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                for (LibraryItem item : catalog) item.showDetails();
            } else if (choice == 2) {
                for (int i = 0; i < catalog.length; i++)
                    System.out.println((i+1) + ". " + catalog[i].title);
                System.out.print("Enter number: ");
                int n = sc.nextInt() - 1;
                if (n >= 0 && n < catalog.length) ((Borrowable)catalog[n]).borrowItem();
            } else if (choice == 3) {
                for (int i = 0; i < catalog.length; i++)
                    System.out.println((i+1) + ". " + catalog[i].title);
                System.out.print("Enter number: ");
                int n = sc.nextInt() - 1;
                if (n >= 0 && n < catalog.length) ((Borrowable)catalog[n]).returnItem();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
