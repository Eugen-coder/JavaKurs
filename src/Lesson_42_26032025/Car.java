package Lesson_42_26032025;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.03.2025
 */

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // сравнивает текущий объект (this) с другим объектом этого же класса (Car)
    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }

    /*
    this vs car - кто больше
    this < car -> отрицательное значение
    this > car -> положительное значение
    this = car ->  вернет 0

    this - car =
     */
}