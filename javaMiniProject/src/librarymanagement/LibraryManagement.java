package librarymanagement;

import java.util.*;
public class LibraryManagement {
 private Map<String, Book> bookMap = new HashMap<>();
 private List<Book> bookList = new ArrayList<>();
 private Set<Book> bookSet = new HashSet<>();
 private LinkedList<Book> bookLinkedList = new LinkedList<>();
 // Add book
 public void addBook(Book book) {
 bookMap.put(book.getId(), book);
 bookList.add(book);
 bookSet.add(book);
 bookLinkedList.add(book);
 System.out.println("Book added successfully.");
 }
 // Display all books
 public void displayBooks() {
 System.out.println("\n--- Displaying All Books (Using List) ---");
 for (Book book : bookList) {
 System.out.println(book);
 }
 }
 // Search by ID
 public void searchBook(String id) {
 if (bookMap.containsKey(id)) {
 System.out.println("Book found: " + bookMap.get(id));
 } else {
 System.out.println("Book not found!");
 }
 }
 // Remove a book by ID
 public void removeBook(String id) {
 if (bookMap.containsKey(id)) {
 Book removedBook = bookMap.remove(id);
 bookList.remove(removedBook);
 bookSet.remove(removedBook);
 bookLinkedList.remove(removedBook);
 System.out.println("Book removed successfully.");
 } else {
 System.out.println("Book not found!");
 }
 }
 // Update book details
 public void updateBook(String id, String title, String author) {
 if (bookMap.containsKey(id)) {
 Book book = bookMap.get(id);
 book.setTitle(title);
 book.setAuthor(author);
 System.out.println("Book updated successfully.");
 } else {
 System.out.println("Book not found!");
 }
 }
 // Sort books by title
 public void sortBooksByTitle() {
 Collections.sort(bookList, Comparator.comparing(Book::getTitle));
 System.out.println("\n--- Books Sorted by Title ---");
 displayBooks();
 }
 // Display Set
 public void displayBookSet() {
 System.out.println("\n--- Displaying All Books (Using Set) ---");
 for (Book book : bookSet) {
 System.out.println(book);
 }
 }
 // Display LinkedList
 public void displayBookLinkedList() {
 System.out.println("\n--- Displaying All Books (Using LinkedList) ---");
 for (Book book : bookLinkedList) {
 System.out.println(book);
 }
 }
 // Clear all books
 public void clearAllBooks() {
 bookMap.clear();
 bookList.clear();
 bookSet.clear();
 bookLinkedList.clear();
 System.out.println("All books cleared.");
 }
}
