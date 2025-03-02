package Lesson_23_27022025;

public class Lesson23Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Test", 10, 4);

        System.out.println(cat.toString());
        cat.setAge(15);
        System.out.println(cat.getAge());

        cat.sayMeow();
      //  cat.isDefault = true;
    }
}
