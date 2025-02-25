package Lesson_21_25022025;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Sozdanie obyekta klassa Cat
        //1. Fizicheski v pamyati sozdaetsya obyekt tipa Cat
        //2. Vizivaetsya konstruktor klassa

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Imya: " + catName);

        System.out.println("Vozrast: " + cat.age);

        System.out.println("\n=============\n");

        Cat cat1 = new Cat("Max");

        System.out.println("cat1.name: " + cat1.name);
        System.out.println("cat1.color: " + cat1.color);

        cat.whoAmI();
        cat1.whoAmI();

        System.out.println("\n===================\n");

        Cat cat2 = new Cat("Diamond", "red");
        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name: " + barsik.name);
        System.out.println("barsik.color: " + barsik.color);
        System.out.println("barsik.age: " + barsik.age);
        barsik.whoAmI();

        Cat catClone = barsik;
        catClone.whoAmI();
        barsik.age = 100;
        System.out.println("barsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();

        System.out.println("\n===========\n");

        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null;

        if (catClone != null) {
            System.out.println(catClone.name);

        }



    }
}
