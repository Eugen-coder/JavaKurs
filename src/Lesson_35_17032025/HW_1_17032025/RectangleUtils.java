package Lesson_35_17032025.HW_1_17032025;

import Lesson_32_12032025.lists.MyArrayList;
import Lesson_32_12032025.lists.MyList;

public class RectangleUtils {

    public static void main(String[] args) {
        MyList<Rectangle> rectangles = new MyArrayList<>();
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println("Список до удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        RectangleUtils.removeDuplicates(rectangles, rectangleToRemove);

        System.out.println("\nСписок после удаления дубликатов:");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }


    }

    public static void removeDuplicates(MyList<Rectangle> list, Rectangle rectangle){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rectangle)){
                list.remove(i);
                i--; // korrektiruem index posle udaleniya
            }
        }

    }

    public static void removeDuplicates2(MyList<Rectangle> list, Rectangle rectangle){
        while (list.contains(rectangle)){
            list.remove(rectangle);
        }
    }
}
