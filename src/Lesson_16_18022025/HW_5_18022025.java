package Lesson_16_18022025;

/*
Task 5
Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */

import java.util.Random;

public class HW_5_18022025 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(11) + 5;
        int[] numbers = new int[length];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50;
            int min = numbers[0];
            int max = numbers[0];
            int sum = 0;

            for (int num: numbers) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;

                }
                sum += num;
            }
            double average = (double) sum / numbers.length;
            System.out.println("Massiv:");
            for (int num: numbers) {
                System.out.print(num +" ");
            }
            System.out.println("\nMinimalnoe znachenie: " + min);
            System.out.println("\nMaksimalnoe znachenie: " + max);
            System.out.println("\nSrednee arifmeticheskoe: " + average);

            System.out.println("\n===================\n");

            /*
             Task 6
             Дан массив целых чисел.
             Поменять местами элементы с максимальным и минимальным значениями.
             */

            for (int x = 0; x < numbers.length; x++) {
                if (numbers[x] == min) {
                    numbers[x] = max;

                } else if (numbers[x] == max) {
                    numbers[x] = min;
                }
            }

            System.out.println("Massiv posle zameni:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

        }

    }
}
