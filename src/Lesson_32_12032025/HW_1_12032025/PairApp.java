package Lesson_32_12032025.HW_1_12032025;

public class PairApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println(pair.getFirst());  // Vivodim: Hello
        System.out.println(pair.getSecond()); // Vivodim: World

        pair.swap();
        System.out.println(pair.getFirst());  // Vivodim: World
        System.out.println(pair.getSecond()); // Vivodim: Hello
    }
}
