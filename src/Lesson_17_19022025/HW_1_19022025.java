package Lesson_17_19022025;

import java.util.Scanner;

/*
Task 1
Написать метод, принимающий на вход строку.
Метод должен вывести на экран число, соответсвующее количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5
(так как в строке hello 5 символов)
 */

public class HW_1_19022025 {
    public static void main(String[] args) {

        // Prosim polzovatelya vvesti slovo (metod - Scanner):

        Scanner scanner = new Scanner(System.in);

        // Vivodim na konsol prosbu (println - s perexodom na novuyu stroku):

        System.out.println("\nVvedite slovo: ");

        // Soxranyaem poluchennoe slovo (text -> nextLine) v peremennoy (a):

        String a = scanner.nextLine();

        // Metod Lendth - schitaet simvoli v stroke (a):

        int length = a.length();

        // Vivodim rezultat na konsol:

        System.out.println("Kolichestvo simvolov: " + length);

    }

    public static void xxx(String[] args) {



    }


}
