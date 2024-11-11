import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 08  >>>>");
        System.out.println();

        int taskN = 0;

        // Task 1

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = new float[]{1.57f, 7.654f, 9.986f};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println();
        System.out.println();

        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int lastIndex = arr1.length - 1;
        for (int j = 0; j <= lastIndex; j++) {
            System.out.print(arr1[j]);
            if (j != lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.println();

        lastIndex = arr2.length - 1;
        for (int j = 0; j <= lastIndex; j++) {
            System.out.print(arr2[j]);
            if (j != lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.println();

        lastIndex = arr3.length - 1;
        for (int j = 0; j <= lastIndex; j++) {
            System.out.print(arr3[j]);
            if (j != lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        lastIndex = arr1.length - 1;
        for (int j = lastIndex; j >= 0; j--) {
            System.out.print(arr1[j]);
            if (j != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        lastIndex = arr2.length - 1;
        for (int j = lastIndex; j >= 0; j--) {
            System.out.print(arr2[j]);
            if (j != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        lastIndex = arr3.length - 1;
        for (int j = lastIndex; j >= 0; j--) {
            System.out.print(arr3[j]);
            if (j != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        //  System.out.println(Arrays.toString(arr1));
        lastIndex = arr1.length - 1;
        for (int j = lastIndex; j >= 0; j--) {
            if (arr1[j] % 2 != 0) {
                arr1[j]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println();

    }
}

