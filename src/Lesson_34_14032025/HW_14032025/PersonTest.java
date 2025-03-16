package Lesson_34_14032025.HW_14032025;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Berem Validniy email
    2. Ustanavlivaem ego setterom person-y
    3. Mi ozhidaem: u person v pole email budet znachenie kotoroe mi ustanavili v shage 2
     */

    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test11@test.com.de", })
    void testValidEmailSet(String validEmail){

        person.setEmail(validEmail);

        Assertions.assertEquals(validEmail, person.getEmail());

    }

    /*
    1. Berem Ne validniy email
    2. Ustanavlivaem ego setterom
    3. Ozhidaemiy rezultat: Email ustanovlen ne budet
        3.1. pole email u person Ne budet ravno "ne validniy email"
        3.2. Znachenie polya email dolzhno ostatsya prezhnim
     */


    /*
    Task1
    Написать тестовый метод для проверки работы с "не валидными" email в классе Person.
    Тестовые данные должны содержать максимально полный набор не валидных email-ов
    С двумя собаками
    без точки после собаки
    и так далее
     */

    @Test
    public void testInvalidEmails() {
        Person person = new Person();

        // Примеры невалидных email-ов
        String[] invalidEmails = {
                "user@@example.com",      // Две собаки
                "userexample.com",        // Без собаки
                "user@.com",              // Нет имени домена
                "user@example",           // Нет доменного уровня
                "user@com",               // Нет точки после собаки
                "@example.com",           // Пустое имя пользователя
                "user@ example.com",      // Пробел в email
                "user@-example.com",      // Недопустимый символ перед доменом
                "user@.example.com",      // Точка сразу после собаки
                "user@example..com"       // Две точки подряд
        };

        for (String email : invalidEmails) {
            assertFalse("Email должен быть невалидным: " + email, person.isValidEmail(email));
        }
    }

    private void assertFalse(String s, Object validEmail) {

    }

    /*
    Task2
    Написать тесты установки пароля в классе Person. Валидные / не валидные пароли.
    */


    @Test
    public void testSetPassword() {
        Person person = new Person();

        // Примеры валидных паролей
        String[] validPasswords = {
                "Password123",       // Буквы + цифры
                "Pa$$w0rd!",         // Специальные символы
                "LongPassword2023"   // Длинный пароль
        };

        for (String password : validPasswords) {
            assertTrue("Пароль должен быть валидным: " + password, person.setPassword(password));
        }

        // Примеры невалидных паролей
        String[] invalidPasswords = {
                "short",             // Слишком короткий
                "12345678",          // Только цифры
                "password",          // Нет цифр или специальных символов
                "PASSWORD123",       // Нет строчных букв
                "pass!word"          // Нет цифр
        };

        for (String password : invalidPasswords) {
            assertFalse("Пароль должен быть невалидным: " + password, person.setPassword(password));
        }
    }

    private void assertTrue(String s, Object o) {

    }


}
