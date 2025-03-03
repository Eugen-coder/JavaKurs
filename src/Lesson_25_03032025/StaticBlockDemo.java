package Lesson_25_03032025;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[3];

    private String title;
    private int capacity = 10;

    static {
        System.out.println("Static Block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    {
        System.out.println("NON-static block RUN!");
        this.title = "DEFAULT";
    }


    public StaticBlockDemo () {
        System.out.println("Constructor RUN!");

        if (counter == 0) {
            this.capacity = 50;
        }

 //       colors[0] = "red";
 //       colors[1] = "green";
 //       colors[2] = "yellow";

    }

    public StaticBlockDemo(String title) {
        System.out.println("Constructor2 RUN!");
 //       if (counter == 0) {
//            this.capacity = 50;
 //       }
    }

    public String toString() {
        return String.format("Title: %s, capasity: %d, static-counter: %d",
                title, capacity, counter);

    }
}
