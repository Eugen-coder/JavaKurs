package Lesson_27_05032025.HW_1_05032025;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public void displayConfiguration() {
        System.out.println("Computer Configuration: ");
        processor.displayInfo();
        memory.displayInfo();
        storage.displayInfo();
    }

}
