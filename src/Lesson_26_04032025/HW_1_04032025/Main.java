package Lesson_26_04032025.HW_1_04032025;

// ======== Task 1 - 2 ========

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.name = "Pryamougolnik";
        rect.setColor("Krasniy");
        rect.setDimensions(8,3);
        rect.displayinfo();
        rect.calculateArea();

        System.out.println();

        Circle circ = new Circle();
        circ.name = "Krug";
        circ.setColor("Siniy");
        circ.setRadius(3);
        circ.calculateArea();
        circ.displayinfo();


    }

}


