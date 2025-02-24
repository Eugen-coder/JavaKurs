package Lesson_16_18022025;

/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.
Результат выведите на экран
 */

public class HW_1_18022025 {
    public static void main(String[] args) {

          long a = 1;
          for (int i = 1; i <= 15; i++) {
              a *= i;
          }
        System.out.println("Task 1: Proizvedenie chisel ot 1 do 15 = " + a);

    }
}
