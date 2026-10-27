package lab3v13.tasks;

import java.util.Arrays;

public class JaggedArrayTask {
    public static void run() {
        System.out.println("\nЧастина C. Іррегулярний масив");

        int jagRows = 4;
        int jagBase = 3;

        int[][] array = new int[jagRows][];

        for (int i = 0; i < array.length; i++) {
            int length = jagBase + (i % 3);
            array[i] = new int[length];

            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = (i + 1) * 100 + (k + 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Рядок " + i + ": "
                    + Arrays.toString(array[i]));
        }
    }
}