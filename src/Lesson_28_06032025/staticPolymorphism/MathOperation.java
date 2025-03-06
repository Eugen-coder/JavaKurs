package Lesson_28_06032025.staticPolymorphism;

/*
Dve formi polimorfizma:
Staticheskiy
Dinamicheskiy
*/

public class MathOperation {

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args){
        System.out.println(sum(1,2));
    }


}
