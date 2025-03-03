package Lesson_25_03032025;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println("static counter: " + StaticBlockDemo.counter);
        System.out.println("static array: " + Arrays.toString(StaticBlockDemo.colors));

        StaticBlockDemo demo = new StaticBlockDemo();

 //       System.out.println(demo.toString());
 //       System.out.println("static array: " + Arrays.toString(StaticBlockDemo.colors));
        StaticBlockDemo demo1 = new StaticBlockDemo();
        StaticBlockDemo demo2 = new StaticBlockDemo("Title");

    }
}
