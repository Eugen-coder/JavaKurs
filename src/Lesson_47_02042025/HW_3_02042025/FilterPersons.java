package Lesson_47_02042025.HW_3_02042025;

import java.util.List;
import java.util.stream.Collectors;

public class FilterPersons {
    public static List<Person> filterPersons(List<Person> persons, int ageLimit, String city) {
        return persons.stream()
                .filter(person -> person.getAge() > ageLimit) // Люди старше определенного возраста
                .filter(person -> person.getCity().equalsIgnoreCase(city)) // Люди из указанного города
                .collect(Collectors.toList()); // Сохраняем результат в список


    }


}
