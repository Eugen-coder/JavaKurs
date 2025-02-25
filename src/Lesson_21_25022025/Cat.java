package Lesson_21_25022025;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.02.2025
 */

public class Cat {
    // характеристики / состояние будущих объектов
    String name; // поле класса
    String color;
    int age;


    /*
    Конструктор класса
    Специальный тип метода, который автоматически вызывается при создании нового объекта.
    Основная задача конструктора - установить начальные свойства объекта (проинициализировать поля)

    Особенности конструктора:
    1. Имя конструктора совпадает с именем класса
    2. Конструктор не имеет типа возвращаемого значения. Даже void не указывается
    (т.к. автоматически возвращает экземпляр класса (объект)
    3. Конструктор вызывается автоматически при создании объекта
     */

    // Перегрузка конструктор

    // Конструктор по умолчанию
    public Cat() {
        // все поля получают значения по умолчанию для своего типа данных
    }

    // Конструктор - это метод. И я могу передать значения, в тело метода
    public Cat(String catName) {
        name = catName;
    }

    public Cat(String catName, String color) {
        name = catName;
        this.color = color;

        // Ключевое слово this используется внутри класса для ссылки на текущий объект
        // Оно поможет при разрешении конфликтов имен полей класса и параметров методов / конструкторов
    }

    public Cat(String name, String color, int age) {
        // this может быть использована для вызова других конструкторов класса
        // или для передачи текущего объекта в качестве параметра метода (разберем позже)
        // System.out.println("Строка перед this()");
        this(name, color); // вызов другого конструктора класса. Должен быть первой строкой исполняемого кода

        // Вызов конструктора, принимающего две String-и
        // Сначала будет выполнен код соответствующего конструктора

//        this.name = name;
//        this.color = color;
        this.age = age;

    }



    // Поведение будущих объектов
    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void run() {
        System.out.println("Я бегу!");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, возраст: %d, мой окраса %s\n", name, age, color);
    }

}
