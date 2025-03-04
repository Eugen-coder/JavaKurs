package Lesson_26_04032025.HW_1_04032025;

public class HW_1_04032025 {

}

// ============= Task 1 - 1 ==============

class Shape {
    String name;
    String color;

    void setColor(String color){
        this.color = color;
    }

    void displayinfo(){
        System.out.println("Figura: " + name + ", Zvet: " + color);
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void calculateArea() {
        double area = width * height;
        System.out.println("Ploshad pryamougolnika: " + area);
    }
}

class Circle extends Shape {
    double radius;
    double PI = 3.141519;

    void setRadius(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Ploshad Kruga: " + area);
    }

}


