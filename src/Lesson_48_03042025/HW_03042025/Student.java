package Lesson_48_03042025.HW_03042025;

class Student {
    private final String name;
    private final int age;
    private final String major;
    private final int year;
    private final double grade;

    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (" + major + ", Year " + year + ", Age " + age + ", Grade " + grade + ")";
    }
}