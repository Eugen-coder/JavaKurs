package Lesson_18_20022025;

    public class HW_1_20022025 {
        public static void main(String[] args) {
            int[] array1 = {0, 1, 2, 3, 4, 5, 6};
            int[] result1 = copyOfArray(array1, 3);
            printArray(result1);

            int[] array2 = {0, 1, 2};
            int[] result2 = copyOfArray(array2, 5);
            printArray(result2);
        }

        public static int[] copyOfArray(int[] original, int newLength) {
            if (newLength < 0) {
                throw new IllegalArgumentException("New length cannot be negative");
            }

            int[] newArray = new int[newLength];
            int lengthToCopy = Math.min(original.length, newLength);

            for (int i = 0; i < lengthToCopy; i++) {
                newArray[i] = original[i];
            }

            return newArray;
        }

        public static void printArray(int[] array) {
            System.out.print("{");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }


