package Lesson_22_26022025;

public class Les22Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println("V numbers yacheek: " + numbers.length);
        numbers[0] = 100;
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        // [1, 3, 5, 4, 100]
        // add (100), remove(5) - [1, 3, 4, 100]

        MagicArrey magic = new MagicArrey();

        System.out.println(magic.toString());

        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6,7,8);
        magic.add(10,20);

        System.out.println("V massive ceychs elementov: " + magic.size());

        String arrayToString = magic.toString();
        System.out.println("arrayToString: " + arrayToString);

        System.out.println("\n==========\n");
        int value = magic.get(0);
        System.out.println("magic.get(0): " + value);

     //   System.out.println("magic.get(15): " + magic.get(15));
        //   System.out.println("magic.get(30): " + magic.get(30));

        magic.test();

        int oldValue = magic.remove(3);
        System.out.println("magic.remove(3): " + oldValue);
        System.out.println(magic.toString());
        System.out.println("size: " + magic.size());
        magic.add(1000);
        System.out.print("Vnutrenniy massiv: ");
        magic.test();
        System.out.println("\n===========\n");

        System.out.println("magic.indexOf(20): " + magic.indexOf(20));

        int index = magic.indexOf(20);
        if (index >= 0) {
            System.out.println("Znachenie bilo naydeno");
        }else{
            System.out.println("Vernulsya otrizatelniy index. Tokogo znacheniya v massive net");
        }

    }
}
