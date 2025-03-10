package Lesson_30_10032025.flyable;

import Lesson_27_05032025.Autobus;

/**
 * @author Sergey Bugaenko
 * {@code @date} 10.03.2025
 */

public class Application {

    public static void main(String[] args) {

        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swim();

        System.out.println("\n=================");

        Flyable[] flyables = new Flyable[2];
        flyables[0] = duck;
        flyables[1] = airplane;

        for (int i = 0; i < flyables.length; i++) {
            Flyable flyable = flyables[i];
            flyable.fly();

            // Проверяем возможность приведения ссылки к типу интерфейса
            if (flyable instanceof Swimmable) {
                System.out.println("Могу привести этот объект к Swimmable");
                Swimmable swimmable = (Swimmable) flyable;
                swimmable.swim();
                System.out.println("================\n");
            }

            // Проверяем возможность приведения ссылки к типу класса
            if (flyable instanceof Airplane) {
                System.out.println("Могу привести к классу Airplane");
                Airplane airplaneLink = (Airplane) flyable;
                System.out.println("вместимость: " + airplaneLink.capacity);
                airplaneLink.takePassenger();
                System.out.println("кол-во пассажиров: " + airplaneLink.amountPassengers);
            }
        }


        System.out.println("\n===============\n");

        Duck duckLink = new Duck();
        duckLink.methodA();

    }
}
