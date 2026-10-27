package lab3v13.tasks;

import java.util.Arrays;

public class Array2DTask {
    public static void run() {
        System.out.println("\nЧастина B. Двовимірний масив");

        int[][] m = new int[6][3];

        // Заповнення матриці
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        System.out.println("Початкова матриця:");
        printMatrix(m);

        // Обмін рядків з індексами 2 і 5
        int[] tempRow = m[2];
        m[2] = m[5];
        m[5] = tempRow;

        System.out.println("Після обміну рядків 2 і 5:");
        printMatrix(m);

        // Обмін стовпців з індексами 0 і 2
        for (int i = 0; i < m.length; i++) {
            int temp = m[i][0];
            m[i][0] = m[i][2];
            m[i][2] = temp;
        }

        System.out.println("Після обміну стовпців 0 і 2:");
        printMatrix(m);
    }

    // Виведення матриці по рядках
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}