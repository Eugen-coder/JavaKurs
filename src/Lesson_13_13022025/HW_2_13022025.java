package Lesson_13_13022025;

/*
Task 2

Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */

import javax.print.attribute.standard.PagesPerMinute;

public class HW_2_13022025 {
    public static void main(String[] args) {
        String a = "Java";
        String b = "is";
        String c = "a";
        String d = "powerful";
        String e = "language";

        System.out.println("\n" + "concat1: " + a + " " + b + " " + c + " " + d + " " + e +".\n");

        String concat2 = String.join(" ",a, b, c, d, e,".");
        System.out.println("concat2: " + concat2);

        System.out.println("\n" + "dlina stroki: " + concat2.length());

        // Task 2.2

        String f = "super";
        String concat3 = concat2.replace(d,f);
        System.out.println("\nZamenyaem POWERFUL na SUPER: " + concat3);

        boolean age = concat2.contains("age");
        System.out.println("\nSoderzhit li stroka podstroku age: " + age);



    }
}
