package Lesson_23_27022025;

public class Employee {

    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;

        } else {
            System.out.println("Vozrast dolzhenbit polozhitelnim");
        }
    }

    public double getSalary() {
        return salary;

    }

    public void setSalary(double salary) {
        if (salary >= 0){
            this.salary = salary;
        } else {
            System.out.println("ZP ne mozhet bit otrizatelnoy");

        }
    }

    public void info(){
        System.out.println("Imya: " + name);
        System.out.println("Vozrast: " + age);
        System.out.println("ZP: " + salary);
    }

    public static void main(String[] arge){
        Employee employee = new Employee("John", 45, 100000);
        employee.info();
    }
}