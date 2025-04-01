package Lesson_46_01042025.HW_2_01042025;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    class Library {
        private final List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public Optional<Book> findBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return Optional.of(book);
                }
            }
            return Optional.empty();
        }
    }

