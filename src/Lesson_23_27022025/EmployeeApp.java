package Lesson_23_27022025;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Max", 25,5000);

        employee.info();

        System.out.println(employee.getName());
    }
}
