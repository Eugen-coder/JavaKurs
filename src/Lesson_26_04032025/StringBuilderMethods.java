package Lesson_26_04032025;

public class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Test string append");
        System.out.println(sb.length());


    }
}
