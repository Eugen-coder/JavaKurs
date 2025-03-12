package Lesson_31_11032025.generics;

// Generic rabotaet tolko so ssilochnimi dannimi. Ne rabotayut s primitivami

public class GenericBox <T>{
//T - type / E - element / K - key / V - value
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
