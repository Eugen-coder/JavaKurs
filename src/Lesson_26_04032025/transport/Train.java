package Lesson_26_04032025.transport;

// Train ia-a Bus - NE VERNO.
public class Train extends Vehicle {

    private int capacity;
    private int countPassengers;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year);
        this.wagonCapacity = wagonCapacity;
        this.countWagons = countWagons;

    }

    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }


    public int getCapacity() {
        return capacity;
    }


    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}
