package Lesson_35_17032025.equals;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Petr", "Petrov", "21.10.2000");
        Employee employee1 = new Employee("Petr", "Ivanov", "05.12.1990");
        Employee employee2 = new Employee("Ivan", "Ivanov", "21.10.2000");
        Employee employee3 = new Employee("Petr", "Petrov", "21.10.2000");
        Employee employeeDate = new Employee("Petr", "Petrov", "01.01.2015");

        // Dva sposoba sravneniya obiektov:

        // Operator == sravnivaet ssilki
        System.out.println("employee == employee1: " + (employee == employee1)); // false
        System.out.println("employee == employee3: " + (employee == employeeDate)); // false

        // Metod equals - logicheskoe sravnenie

        System.out.println("employee.equals(employee1): " + employee.equals(employee1));
        System.out.println("employee.equals(employee3): " + employee.equals(employee3));
        System.out.println("employee.equals(employeeDate): " + employee.equals(employeeDate));

    }
}
