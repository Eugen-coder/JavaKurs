package Lesson_25_03032025;

public class ConstantDemo {

    public static final double PI = 3.141519;
    public static final String COUNTRY = "Germany";
    public static final String[] COLORS = {"blue","red", "green"};


    public static final int[] ints = new int[5];

    public ConstantDemo() {
        COLORS[0] = "purple";
        String newString = COUNTRY.toUpperCase();

    }

    public static double doublePiSqrt(){
        double result = 2 * PI * PI;
        return result;
    }
}
