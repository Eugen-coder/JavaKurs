package Lesson_27_05032025.HW_1_05032025;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel","Core i9");
        Memory memory = new Memory("Kingston", "32GB DDR5");
        Storage storage = new Storage("Gigabyte", "2TB SSD");

        Computer computer = new Computer(processor, memory, storage);
        computer.displayConfiguration();
    }
}
