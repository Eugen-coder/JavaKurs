package Lesson_34_14032025;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Poryadok zapuska testovix metodov budet opredelyatsya annotaziey @Order

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OrderedTest {

    @Test
    @Order(10)
    void firstTest(){
        System.out.println("First Test");
    }

    @Test
    @Order(20)
    void secondTest(){
        System.out.println("Second Test");
    }

    @Test
    @Order(30)
    void thirdTest(){
        System.out.println("Third Test");
    }

    @Test
    @Order(40)
    void randomTest(){
        System.out.println("Random Test");
    }



}
