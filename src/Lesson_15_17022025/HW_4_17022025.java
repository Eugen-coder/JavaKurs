package Lesson_15_17022025;

import java.util.Random;

/*
Task 4 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */
public class HW_4_17022025 {
    public static void main(String[] args) {
        Random random = new Random();

        int note = random.nextInt(13);

        System.out.println("Ozenka: " + note);

        int timeMax = 60;
        int restToday = 45;

        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("skazhite rebenku, kak vi radi");
                restToday += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Poxvalite rebenka");
                restToday += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("neitralno otnesites");
                restToday += 15;
                break;
            case 3:
                System.out.println("ogorchites");
                restToday -= 30;
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("Zapretite televizor na segodnya");
                restToday = 0;
                break;
            default:
                System.out.println("Stirat ozenki v dnevnike ne xoposho!");
                System.out.println("Takix ozenok ne bivaet!");
        }

    }
}
