package Lesson_29_07032025.HW_1_07032025;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.

Реализуйте классы-наследники Circle, Rectangle, и Triangle.

Убедитесь, что все классы правильно вычисляют площадь и периметр.

Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
