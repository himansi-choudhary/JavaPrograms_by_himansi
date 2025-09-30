package librarymanagement;

import java.util.Scanner;
public class LibraryMain {
 public static void main(String[] args) {
 LibraryManagement library = new LibraryManagement();
 Scanner sc = new Scanner(System.in);
 while (true) {
 System.out.println("\n1. Add Book");
 System.out.println("2. Display All Books");
 System.out.println("3. Search Book by ID");
 System.out.println("4. Remove Book by ID");
 System.out.println("5. Update Book");
 System.out.println("6. Sort Books by Title");
 System.out.println("7. Display Set of Books");
 System.out.println("8. Display LinkedList of Books");
 System.out.println("9. Clear All Books");
 System.out.println("10. Exit");
 System.out.print("Enter your choice: ");
 int choice = sc.nextInt();
 sc.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter ID: ");
 String id = sc.nextLine();
 System.out.print("Enter Title: ");
 String title = sc.nextLine();
 System.out.print("Enter Author: ");
 String author = sc.nextLine();
 library.addBook(new Book(id, title, author));
 break;
 case 2:
 library.displayBooks();
 break;
 case 3:
 System.out.print("Enter Book ID to search: ");
 String searchId = sc.nextLine();
 library.searchBook(searchId);
 break;
 case 4:
 System.out.print("Enter Book ID to remove: ");
 String removeId = sc.nextLine();
 library.removeBook(removeId);
 break;
 case 5:
 System.out.print("Enter Book ID to update: ");
 String updateId = sc.nextLine();
 System.out.print("Enter new Title: ");
 String newTitle = sc.nextLine();
 System.out.print("Enter new Author: ");
 String newAuthor = sc.nextLine();
 library.updateBook(updateId, newTitle, newAuthor);
 break;
 case 6:
 library.sortBooksByTitle();
 break;
 case 7:
 library.displayBookSet();
 break;
 case 8:
 library.displayBookLinkedList();
 break;
 case 9:
 library.clearAllBooks();
 break;
 case 10:
 System.out.println("Exiting...");
 sc.close();
 System.exit(0);
 default:
 System.out.println("Invalid Choice!");
 }
 }
 }
}
