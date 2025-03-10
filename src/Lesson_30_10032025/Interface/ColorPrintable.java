package Lesson_30_10032025.Interface;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

// Интерфейс может расширять другой интерфейс
public interface ColorPrintable extends Printable {
    // дочерний интерфейс наследует все методы родительского интерфейса

    void colorPrint();

}
