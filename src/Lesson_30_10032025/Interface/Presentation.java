package lesson_30.interfaces;

import Lesson_30_10032025.Interface.ColorPrintable;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

public class Presentation implements ColorPrintable {
    String title;
    String author;
    String theme;

    public Presentation(String title, String author, String theme) {
        this.title = title;
        this.author = author;
        this.theme = theme;
    }

    @Override
    public void colorPrint() {
        System.out.printf("Печатаю презентация в цвете: author %s, title %s, theme %s\n", author, title, theme);
    }

    @Override
    public void print() {
        System.out.printf("Печать чб презентации %s автора %s\n", title, author);
    }
}
