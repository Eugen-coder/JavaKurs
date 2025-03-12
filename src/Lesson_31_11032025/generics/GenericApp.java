package Lesson_31_11032025.generics;

import Lesson_21_25022025.Cat;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");
        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

       // box.setValue(1000);

        box.setValue("New Value");
        System.out.println(box);

        System.out.println("==================");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());
        System.out.println(catBox.getValue());
        catBox.setValue(null);


        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);

        System.out.println(intBox);

        int sum = intBox.getValue() + intBox2.getValue();

        System.out.println(sum);

        int val = intBox.getValue();
        Integer integerVal = intBox.getValue();

    }
}
