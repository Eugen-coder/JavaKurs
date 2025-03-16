package Lesson_33_13032025.Persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

    // Metod, kotoriy vipolnyaetsya pered Kazhdim testovim metodom
    @BeforeEach
    void setUp(){
        System.out.println("Method BeforeEach");
    }

    /*
    @BeforeAll - metod vipolnyaetsya odin raz pered vipolneniem pervogo testovogo metoda
    @AfterEach - posle kazhdogo testovogo metoda
    @AfterAll - vipolnyaetsya odin raz posle vsex testovix metodov
    @Disabled - test otklyuchen
     */

    // @Test ukazivaet, metod testoviy
    // JUnit znaet, chto etot metod nado zapustit vo vremya vipolneniya testov

    @Test
    public void testAddition(){
        System.out.println("Test Addition");

        // Protestirovat

        int rezult = 2 + 3;

        // Metodi proverki utverzhdeniy
        // assertEquals(expected, rezult);
        Assertions.assertEquals(5, rezult); // Proveryaet ravni li dva znacheniya.
        Assertions.assertNotEquals(0,rezult); // Test budet proyden, esli fakticheskiy rezultat HE sovpadet s "neozhidaemim rezultatom"
        Assertions.assertTrue( rezult >= 4); // proveryaet, chto uslovie verno (uslovie vozvrashaet true)
        assertEquals(10, 5 + 5);
        assertFalse(rezult > 10); // proveryaet, chto uslovie lozhno (uslovie vozvrashaet false)
        assertNull(null); // poydet, eslo obiekt raven null
        assertNotNull("String"); // proveryaet, chto obiekt ne raven null
    }

    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
        //Esli v metode net lozhnogo utverzhdeniya - on schitaetsya proydennim.
    }

    // Parametrizovannie testi.
    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit){
        System.out.println("cuurent value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);

//        @ParameterizedTest
//        @ValueSource(ints = {1,2})
//        void testStatic(int value) {
//            System.out.println("static value run: " + value);
//            Autobus bus = new Autobus(new BusDriver("Test", "11111"), 10);
//            System.out.println(bus);
//        }


    }

    // Istochnik dannix v formate CSV -
    // Istochnik dannix v formate CSV

    // Istochnik dannix - metod
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit){
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruits () {
        return Stream.of("apple", "banana", "kiwi", "cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value){
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1,2,-10,0,15);
    }

    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceInt(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + isEquals + " | " + expected);
        int rezult = value * value;
        assertNotEquals(expected, rezult);
    }





}