package Lesson_28_06032025.HW_1_06032025.Task1;

public class Main {
    public static void main(String[] args){

        Human human = new Human();
        Lyubitel lyubitel = new Lyubitel();
        Pro pro = new Pro();

        System.out.println("\n=== Prostoy chelovek ===");
        human.run();
        System.out.println("\n=== Lyubitel ===");
        lyubitel.run();
        System.out.println("\n=== Pro ===");
        pro.run();

    }
}
