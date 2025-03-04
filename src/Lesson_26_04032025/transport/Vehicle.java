package Lesson_26_04032025.transport;

public class Vehicle {

    protected String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

 //   public Vehicle() {

 //   }

    public String toString() {
        return model + ", year of manufacture : " + year;

    }

    public void start() {
        System.out.println(model + " nachinaet dvizhenie ");

    }

    public void stop() {
        System.out.println(model + " ostanavlivaetsya ");

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

}
