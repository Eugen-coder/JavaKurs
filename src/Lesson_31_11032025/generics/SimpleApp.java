package Lesson_31_11032025.generics;

public class SimpleApp {

    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(10);
        System.out.println(box);
        SimpleBox box1 = new SimpleBox(20);

        int sum = (int) box.getValue() + (int) box1.getValue();
        System.out.println("sum = " + sum);

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0] = box;
        boxes[1] = box1;
        boxes[2] = new SimpleBox(30);

        int sumAll = 0;
        for (int i = 0; i < boxes.length; i++) {
            sumAll += (int) boxes[i].getValue();

        }

        System.out.println("sumAll = " + sumAll);

    }
}
