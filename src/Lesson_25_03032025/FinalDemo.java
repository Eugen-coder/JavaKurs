package Lesson_25_03032025;


public class FinalDemo {

    private final int capacity;

    private final int[] ints = new int[5];

    private int noFinal;

    public FinalDemo(int capacity) {
        this.capacity = capacity;
       // this.capacity++;

        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;


    }

    public void finalArguments (int x, int[] array) {
        x++;

        array[0] = x;
        array[1] = 1000;
    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNoFinal() {
        return noFinal;
    }

    public void setNoFinal(int noFinal) {
        this.noFinal = noFinal;
    }

   // public int[] getArray() {
   //     return array;
    }

  //  public void setArray(int[] array) {
  //      this.array = array;
  // }
