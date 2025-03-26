package Lesson_42_26032025.HW_1_26032025;

import java.util.Comparator;

// Класс для сортировки по score
class ScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Integer.compare(s1.score, s2.score);
    }
}
