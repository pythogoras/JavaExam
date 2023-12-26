/*Написати клас, який виконувати роль бази складу книжок. Він повинен зберігати в собі назву книги та її кількість на складі. Також в класі повинні бути реалізовані функції додавання, видалення продукту, показу списку усіх книг*/
package task8;

import java.util.ArrayList;
import java.util.Scanner;



public class BooksDatabase {
    private static ArrayList<Book> books;
    private static Scanner input;
    private static boolean terminal;
    private static final String help = "Commands:\n" + //
    "add - for adding book\n" + //
    "del - for remove book\n" + //
    "show - for show books\n" + //
    "exit - for exit";

    static {
        books = new ArrayList<>();
        input = new Scanner(System.in);
        terminal = true;
    }

    public static void main(String[] args) {
        while (terminal) {
            System.out.println(help);
            System.out.print("Input please command: ");
            String command = input.next();
            switch (command) {
                case "add":
                    BooksDatabase.addBook();
                    break;
                case "del":
                    BooksDatabase.removeBook();
                    break;
                case "show":
                    BooksDatabase.showBook();
                    break;
                case "exit":
                    terminal = false;
                    break;
                default:
                    System.out.println("Error! Not exist command " + command);
                    break;
            }
        }
    }

    private static void addBook() {
        String title = null;
        int quantity = 0;
        while (quantity == 0 && title == null) {
            System.out.print("Input please title book: ");
            title = input.next();
            System.out.print("Input please quantity books: ");
            quantity = input.nextInt();
        }
        Book book = new Book(title, quantity);
        books.add(book);
    }

    private static void removeBook() {
        System.out.print("Input please title book: ");
        String title = input.next();
        boolean existBook = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                existBook = true;
                System.out.println("book " + title + " deleted");
                break;
            }
        }
        if (!existBook) {System.out.println("book " + title + " not exist");}
    }

    private static void showBook() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getQuantity());
        }
    }
}
