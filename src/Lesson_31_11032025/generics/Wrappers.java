package Lesson_31_11032025.generics;

public class Wrappers {
    public static void main(String[] args) {

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MAX_VALUE);

        maxValue = null;
        Integer wrapperInt = 5; // Autoupakovka
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Autoraspakovka
        System.out.println(primitiveInt);

        System.out.println("===================");

        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127 " + (a == b));
        System.out.println("127.equals(127): " + a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128 " + (c == d));
        System.out.println("128.equals(128): " + c.equals(d));

        System.out.println("====================");

        // ..valueOf() - preobrazuet primitiv ili stroku v obekt tipa obertki

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl: " + dbl);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println("b1: " + b1);

        System.out.println("======================");

        // parseXXX() - preobrazuet stroku v primitiv
        double dblP = Double.parseDouble("456");
        Double dblD = Double.valueOf("456");

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123"));

        // toString - pereopredelen metod
        // equals - sravnivaet dva obekta po znacheniyu

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);

        // compareTo - sravnivaet tekushiy obiekt s drugim obiektom. Kto bolshe?
        // Vozvrashaemoe znachenie int

        System.out.println("127.compareTo(256): " + i1.compareTo(i2));
        System.out.println("256.compareTo(127): " + i2.compareTo(i1));

        /*
        i1 > i2 -> polozhitelnoe
        i1 < i2 -> otrizatelnoe
        i1 = i2 -> 0
         */

        System.out.println("=============================");

        // xxxValue() - vozvrashaet znachenie obiekta kak primitivniy tip

        Double d2 = 125.67; // Avtoupakovka
        d2 = Double.valueOf(125.67); // prinuditelnaya upakovka
        double dPrimitive = d2; // Avtoraspakovka
        dPrimitive = d2.doubleValue(); // Prinuditelnaya raspakovka

        System.out.println("=========================");
        /*
        Class Number. Vse obertki nasleduyutsya ot Number
        Byte, Short, Integer, Long, Float, Double
         */

        /*
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        //
        Integer integer = 31844;

        double dVal = integer.doubleValue();
        System.out.println(dVal);
        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println("dWrapper.byteValue(): " + dWrapper.byteValue());
        System.out.println("dWrapper.intValue(): " + dWrapper.intValue());

    }
}
