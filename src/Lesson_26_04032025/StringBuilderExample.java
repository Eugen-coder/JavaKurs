package Lesson_26_04032025;

import java.util.Arrays;

public class StringBuilderExample {
    public static void main(String[] args) {


        String str = "Java" + " " + "is" + " " + "the" + " " + "best";

        // StringBuilder - klass kotoriy ispolzuetsya dlya sozdaniya i manipulirovaniya
        // izmenyaemimi strokami

        // Peregruzhenniy konstruktor

        StringBuilder sb = new StringBuilder(); // pustoy konstruktor
        sb = new StringBuilder("Hello");

        sb.append(" "); // "Hello" + " ";

        String string = sb.toString();
        System.out.println(string);

        // Pozvolyaet vstavit simvoli v ukazannuyu poziziyu

        sb = new StringBuilder("Hello World"); // Hello beautiful World

        sb.insert(6, "beauteful ");
        System.out.println(sb.toString());

 //       String start = "Hello World";
 //       String result = start.substring(0,6);
 //       result += "beautiful ";
 //       result += start.substring(6);
 //       System.out.println(result);

        // Zamena znacheniya:

        sb = new StringBuilder("Hello World!");
        sb.replace(6,11,"Java");
        System.out.println(sb.toString());

        // Udalenie znacheniya:

        sb = new StringBuilder("Hello World!");
        sb.delete(5,11);
        System.out.println(sb.toString());

        // Poisk nuzhnoy podstroki:

        sb = new StringBuilder("Hello World!");
        int index = sb.indexOf("W");
        System.out.println(index);

        System.out.println("\n======= reverse =====\n");

        // Revers - Razvorachivaet simvoli:
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        // poluchit simvol po index:
        sb = new StringBuilder("Hello World!");
        char ch = sb.charAt(3);
        System.out.println(ch);

        // kol-vo simvolov v sb (dlina):
        System.out.println("length: " + sb.length());

        // ustanovit novuyu dlinu:
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // esli uvelichit stroku, ona budet zapolnena char s kodom 0:
        System.out.println(sb.toString());
        char ch1 = sb.charAt(8);
        System.out.println("sb.charAt(8) code: " + (int) ch1);

        sb.setLength(3);
        System.out.println("sb.setLength(3): " + sb.toString());
        System.out.println("sb.length(): " + sb.length());

        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] words = example.split(" ");
        System.out.println(Arrays.toString(words));

        String str1 = "dhgjhsdg jhsdgfksdjh";
        // poluchit massiv simvolov(char), iz kotorix sostoit stroka:
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));




    }
}
