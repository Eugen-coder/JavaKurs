package Lesson_26_04032025.transport;


// extends - nasledovanie. Bus nasleduet ot Vehicle.
// Smartphone is - a Vehicle -> NE verno. Primenyat nasledovanie NELZYA!
// Bus is-a Vehicle - verno. Mozhno primenit nasledovanie.

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    // Konstruktor po umolchaniyu
  //  public Bus() {
        // Eto obrashenie k roditelskomu klassu
        // Vizov Konstruktora roditelskogo klassa
   //     super();
 //   }


    public Bus(String model, int year, int capacity) {
        super(model, year);// Viyov roditelskogo konstruktora
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassengers() {

        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Passazhir zashel v avtobus: " + model);
            return true;
        }
        System.out.printf("V avtobuse %s bolshe mest net. Seichas %d passazhirov", model, countPassengers);

        return false;
    }

}
