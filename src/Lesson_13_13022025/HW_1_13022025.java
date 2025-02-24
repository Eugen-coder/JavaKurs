package Lesson_13_13022025;

import java.util.Scanner;

/*
Task 1

Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */

public class HW_1_13022025 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite svoe imya: ");
        String name = scanner.nextLine();
        System.out.println("V imeni: " + name +" - "+ name.length() + " simvolov.");

        char n1 = name.charAt(0);
        char n2 = name.charAt(name.length()-1);
        System.out.println("Perviy simvol: " + n1);
        System.out.println("Posledniy simvol: " + n2);
        System.out.println("Perviy simvol code: " + (int)n1);
        System.out.println("Posledniy simvol code: " + (int)n2);

        System.out.println("\n===================\n");



    }

}
