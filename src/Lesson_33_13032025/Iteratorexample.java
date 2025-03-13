package Lesson_33_13032025;

// Est dva vida interfeisa
// Iterable<T> - obiekti etogo klassa mozhno posledovatelno perebirat
// Iterator<T> iterator() - vozvrashaet iterator dlya etogo nabora elementov(kollekzii)
//

import Lesson_32_12032025.lists.MyArrayList;
import Lesson_32_12032025.lists.MyList;

import java.util.Iterator;

public class Iteratorexample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
        }

        // for-each
        /*
        for (Tip Peremennoy imya Peremennoy : kollekziya){
              deystviya s peremennoy
        }
         */

        System.out.println("================");

        for (String strCurrent : list){
            System.out.println(strCurrent);
        }

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,2,3,4,5,6);

        // Vivesti v konsol vse chisla, kotorie est v spiske umnozhenie na 2.

        for (Integer value : integers){
            System.out.println(value * 2);
        }
        System.out.println("==================");

        // Vivesti vse elementi massiva ziklom for-each:

        int[] array = {10,20,30,40,50};

        for (int element : array){
            System.out.println(element);
        }

    }

}
