package Lesson_48_03042025.HW_03042025;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

    public class task4{
        public static void main(String[] args) {
            // Создание списка студентов (минимум 10 объектов)
            List<Student> students = List.of(
                    new Student("Alice", 20, "CS", 1, 85.5),
                    new Student("Bob", 21, "Math", 2, 90.0),
                    new Student("Charlie", 19, "CS", 1, 78.5),
                    new Student("Diana", 22, "Physics", 3, 88.0),
                    new Student("Eve", 20, "Math", 2, 92.0),
                    new Student("Frank", 23, "CS", 3, 81.0),
                    new Student("Grace", 20, "Physics", 2, 87.5),
                    new Student("Hank", 24, "Math", 4, 84.0),
                    new Student("Ivy", 18, "CS", 1, 90.5),
                    new Student("Jack", 22, "Physics", 3, 92.0)
            );

            // Группировка по специальности
            Map<String, List<Student>> groupByMajor = students.stream()
                    .collect(Collectors.groupingBy(Student::getMajor));
            System.out.println("Группировка по специальности: " + groupByMajor);

            // Группировка по курсу с использованием Set
            Map<Integer, Set<Student>> groupByYear = students.stream()
                    .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));
            System.out.println("Группировка по курсу: " + groupByYear);

            // Подсчёт количества студентов по специальности
            Map<String, Long> countByMajor = students.stream()
                    .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
            System.out.println("Количество студентов по специальности: " + countByMajor);

            // Средний балл по специальности
            Map<String, Double> averageGradeByMajor = students.stream()
                    .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));
            System.out.println("Средний балл по специальности: " + averageGradeByMajor);

            // Список оценок по специальности
            Map<String, List<Double>> gradesByMajor = students.stream()
                    .collect(Collectors.groupingBy(Student::getMajor, Collectors.mapping(Student::getGrade, Collectors.toList())));
            System.out.println("Оценки по специальности: " + gradesByMajor);

            // Суммарная статистика по возрасту
            IntSummaryStatistics ageStatistics = students.stream()
                    .collect(Collectors.summarizingInt(Student::getAge));
            System.out.println("Статистика по возрасту: " + ageStatistics);
        }
    }



