package Lesson_22_26022025;

import java.util.Arrays;

public class MagicArrey {
    int[] array; // null
    int cursor;

    // Metodi rasshiryaushie funkzional massiva

   public MagicArrey() {
       this.array = new int[10];
   }

   void add(int value) {

       // Proverka! Est li svobodnoe mesto vo vnutreem massive
       // Esli net mesta - nuzhno dobavit mesto

       if (cursor == array.length){
           expandArray();
       }

       array[cursor] = value;
       cursor++;

   }

   void expandArray() {
       System.out.println("Rasshiryam vnutreniy massiv! Kursor = " + cursor);

       /*
       1. Sozdanie bolshego razmera (v 2 raza)
       2. Perepisat v noviy massiv vse znacheniya iz starogo (do kursora)
       3. Perebrosit ssilku
        */

       // 1
       int[] newArray = new int[array.length * 2];
       // 2
       for (int i = 0; i < cursor; i++){
           newArray[i] = array[i];
       }
       // 3 Perebrasivaem ssilku
       array = newArray;


   }

   // Dobavlenie v massiv neskolkix elementov

    void add(int... numbers){
       // s numbers ya mogu obrashatsya takzhe kak co ccilkoy na massiv int
        System.out.println("Prinyal neskolko intov: " + numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println("U kazhdogo inta est index, kak v massive " + numbers[0]);

        for (int i = 0; i < numbers.length; i++){
            add(numbers[i]);
        }
    }

   // Vozvrashaet strokovoe predstavlenie massiva
    // [5, 20, 45]
    public String toString() {

       if (cursor == 0) return "[]";

       String result = "[";
       for (int i = 0; i < cursor; i++) {
           result += array[i] + (i < cursor - 1 ? ", " : "]");

       }

       return result;

    }

    // Tekushee kol-vo elementov v massive

    int size() {
       return cursor;
    }

    // Vozvrashaet znachenie po indexu
    int get(int index){

       if (index >= 0 && index < cursor){
           return array[index];
       }

        // Fixme - pochinit oshibku
        // Kod, esli index ne korrektniy
        // Xoposhego pesheniya net

       return -2_147_483_647;
       // Todo Popravit obrabotku nkorrektnogo indexa

    }

    // Udalit element po indexu
    int remove(int index) {

       if (index >= 0 && index < cursor){
           int value = array[index];

           // Fixme cursor -1
           for (int i = index; i < cursor - 1; i++) {
               array[i] = array[i + 1];
           }

           cursor--;

           return value;
       } else {
           return -2_147_483_647;
       }
    }

    // Poisk po znacheniyu
    // {1, 100, 5, 24, 0} -> indexOf(5) = 2; indexOf(50) = -1;
    int indexOf(int value){
       // perebirayu vse znachimie elementi
        // Esli element raven iskomomu _ vernut index takogo elementa
        //

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;

    }

    // Udalenie elementa po znacheniyu
    boolean removeByValue(int value){
        // Todo HomeWork
        return -1;
    }

    // Index poslednego vxozhdeniya
    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
    int lastIndexOf(int value){
       // Todo HomeWork
        return false;
    }



    void test() {
        System.out.println(Arrays.toString(array));

    }
}
