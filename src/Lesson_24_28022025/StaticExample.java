package Lesson_24_28022025;

public class StaticExample {

    int x;

    static int staticy;

    public static void staticMethod() {
        // x++; -> net dostupa
        staticy++; // dostup est
        // this.x -> net dostupa

    }

    public void nonStaticMethod() {

        x++;
        staticy++;
        staticMethod();

    }

    public static void main(String[] args) {

       // x = 10; -> Net dostupa k peremennoy
        staticy = 10;
        System.out.println(staticy);

        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();
        StaticExample.staticMethod();





    }


}
