package Lesson_33_13032025.Persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("test@mail.net", "password");
        person.setEmail("test@email.net");
        System.out.println(person);

        System.out.println("===================");

        System.out.println("Пример валидного пароля: " + person.isPasswordValid("Password1!"));
        System.out.println("Пример НЕвалидного пароля: " + person.isPasswordValid("pass"));



    }



}
