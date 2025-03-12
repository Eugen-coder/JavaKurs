package Lesson_31_11032025.Reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alex");
        Field nameField = Person.class.getDeclaredField("name"); // Privatnoe pole name
        nameField.setAccessible(true); // otkrivayu dostup k privatnomu polyu
        nameField.set(person, "Mariya"); // menyau znachenie v pole
        System.out.println("Znachenie v pole name: " + nameField.get(person)); // proveryaem rabotu
        nameField.setAccessible(false); // zakrivaem pole
        System.out.println(person);
        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello"); // metod po imeni
        sayHelloMethod.setAccessible(true); // snimaet privatnost
        sayHelloMethod.invoke(person); // Vizov metoda
        sayHelloMethod.setAccessible(false);// Vosstanovlenie privatnost
        System.out.println("===================");

        Class<?> personClass = Class.forName("Lesson_31_11032025.Reflex.Person");
        Constructor<?> constructor = personClass.getConstructor(String.class);

        Person object = (Person) constructor.newInstance("Sergey");

        System.out.println(object);



    }
}
