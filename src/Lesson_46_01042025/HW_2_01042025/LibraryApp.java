package Lesson_46_01042025.HW_2_01042025;

import java.util.Optional;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("War and Peace", "Leo Tolstoy"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("1984", "George Orwell"));

        // Поиск книги, которая точно есть
        Optional<Book> foundBook = library.findBookByTitle("1984");
        foundBook.ifPresent(book -> System.out.println("Найдена книга: " + book.getTitle() + ", автор: " + book.getAuthor()));

        // Поиск книги, которой нет
        Optional<Book> notFoundBook = library.findBookByTitle("Unknown Book");
        if (notFoundBook.isEmpty()) {
            System.out.println("Книга не найдена.");
        }
    }
}
