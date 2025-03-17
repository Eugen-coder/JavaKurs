package Lesson_35_17032025.HW_1_17032025;

public class RectangleApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0,10.0);
        Rectangle rectangle0 = new Rectangle();
        Rectangle rectangle1 = new Rectangle(4.0,1.0);
        Rectangle rectangle2 = new Rectangle(10.0,2.0);
        Rectangle rectangle3 = new Rectangle(10.0,2.0);

        System.out.println(rectangle);
        System.out.println(rectangle0);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        System.out.println("===================");

        System.out.println("Rectangle4 == Rectangle5: " + rectangle2.equals(rectangle3));
        System.out.println("Rectangle4 != Rectangle3: " + rectangle2.equals(rectangle1));


    }


}
