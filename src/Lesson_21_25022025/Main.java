package Lesson_21_25022025;

// Абстрактный класс Человек
abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void introduce();
}

// Класс Студент
class Student extends Person {
    String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    void introduce() {
        System.out.println("Я студент. Меня зовут " + name + ", мне " + age + " лет, я учусь в " + university + ".");
    }
}

// Класс Преподаватель
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("Я преподаватель. Меня зовут " + name + ", мне " + age + " лет, я преподаю " + subject + ".");
    }
}

// Класс Врач
class Doctor extends Person {
    String hospital;

    public Doctor(String name, int age, String hospital) {
        super(name, age);
        this.hospital = hospital;
    }

    @Override
    void introduce() {
        System.out.println("Я врач. Меня зовут " + name + ", мне " + age + " лет, я работаю в " + hospital + ".");
    }
}


// Главный класс
public class Main {
    public static void main(String[] args) {
        Person student = new Student("Иван", 20, "AIT");
        Person teacher = new Teacher("Мария", 35, "Математикy");
        Person doctor = new Doctor("Алексей", 40, "Городскoy больницe");

        student.introduce();
        teacher.introduce();
        doctor.introduce();
    }
}