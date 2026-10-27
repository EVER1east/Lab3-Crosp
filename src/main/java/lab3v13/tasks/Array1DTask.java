package lab3v13.tasks;

import java.util.Arrays;

public class Array1DTask {
    public static void run() {
        System.out.println("\nЧастина A. Одновимірний масив");

        int n = 14;
        int a = 2;
        int b = 13;

        int[] x = new int[n];

        // Заповнення масиву
        for (int i = 0; i < x.length; i++) {
            x[i] = a * i - b;
        }

        System.out.println("Початковий масив: " + Arrays.toString(x));

        int min = x[0];
        int max = x[0];
        int sum = 0;

        // Пошук мінімуму, максимуму та суми через foreach
        for (int value : x) {
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }

            sum = sum + value;
        }

        System.out.println("Мінімум = " + min);
        System.out.println("Максимум = " + max);
        System.out.println("Сума = " + sum);

        // Сортування за зростанням
        Arrays.sort(x);
        System.out.println("Після сортування: " + Arrays.toString(x));

        // Обмін елементів з індексами 5 і 13
        int temp = x[5];
        x[5] = x[13];
        x[13] = temp;

        System.out.println("Після обміну: " + Arrays.toString(x));

        // compressMode = 1: видалення від'ємних елементів
        int[] temporary = new int[x.length];
        int count = 0;

        for (int value : x) {
            if (value >= 0) {
                temporary[count] = value;
                count++;
            }
        }

        x = Arrays.copyOf(temporary, count);
        System.out.println("Без від'ємних: " + Arrays.toString(x));

        // Демонстрація чотирьох способів копіювання
        int[] reference = x;
        int[] cloned = x.clone();
        int[] copied = Arrays.copyOf(x, x.length);

        int[] systemCopy = new int[x.length];
        System.arraycopy(x, 0, systemCopy, 0, x.length);

        System.out.println("\nДо зміни:");
        System.out.println("x дорівнює cloned: " + Arrays.equals(x, cloned));

        // reference і x посилаються на один масив
        reference[0] = reference[0] + 100;

        System.out.println("\nПісля зміни reference[0]:");
        System.out.println("x: " + Arrays.toString(x));
        System.out.println("reference: " + Arrays.toString(reference));
        System.out.println("clone: " + Arrays.toString(cloned));
        System.out.println("copyOf: " + Arrays.toString(copied));
        System.out.println("arraycopy: " + Arrays.toString(systemCopy));

        System.out.println("x дорівнює cloned: " + Arrays.equals(x, cloned));
        System.out.println("copied дорівнює systemCopy: "
                + Arrays.equals(copied, systemCopy));
    }
}