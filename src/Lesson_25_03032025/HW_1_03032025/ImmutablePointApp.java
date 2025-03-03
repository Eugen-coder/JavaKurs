package Lesson_25_03032025.HW_1_03032025;

public class ImmutablePointApp {
    public static void main(String[] args) {

        ImmutablePoint immutablePoint = new ImmutablePoint(2,3);
        System.out.println("x: " + immutablePoint.x);
        System.out.println("y: " + immutablePoint.y);

        System.out.println("X : Y izmenit cherez > set < NELZYA!");
    }

}
