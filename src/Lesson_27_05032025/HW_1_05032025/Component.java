package Lesson_27_05032025.HW_1_05032025;

public class Component {

    String brand;
    String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

}


class Processor extends Component {
    public Processor(String brand, String model) {
        super(brand, model);
    }

}

class Memory extends Component {
    public Memory(String brand, String model) {
        super(brand, model);
    }
}

class Storage extends Component {
    public Storage(String brand, String model) {
        super(brand, model);
    }
}






