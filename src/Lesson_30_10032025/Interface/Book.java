package Lesson_30_10032025.Interface;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

// Если класс реализует (имплементирует) интерфейс, класс обязан реализовать все абстрактные методы интерфейса
public class Book implements Printable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title, author);
    }
}
