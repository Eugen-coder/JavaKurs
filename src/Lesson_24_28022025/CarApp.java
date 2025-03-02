package Lesson_24_28022025;

public class CarApp {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", 200);
        System.out.println("static. totalCars: " + Car.totalCars);

        System.out.println("Posle sozdaniya 1 mashini: " + bmw.toString());

        Car vw = new Car("VW", 300);

        System.out.println(vw.toString());
        System.out.println("Posle sozdaniya 2-x: " + bmw.toString());
        System.out.println("Static variable: " + Car.totalCars);

    }
}
