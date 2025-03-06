package Lesson_28_06032025.animals;

public class TestToString {
    private String title;

    public TestToString(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestClass: " + title;
    }

    public static void main(String[] args){
        TestToString test = new TestToString("test");

        System.out.println(test);

        String rezult = "Hello, " + test;

        System.out.println(rezult);

    }



}
