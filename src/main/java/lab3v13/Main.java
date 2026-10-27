package lab3v13;

import lab3v13.tasks.Array1DTask;
import lab3v13.tasks.Array2DTask;
import lab3v13.tasks.JaggedArrayTask;
import lab3v13.tasks.ArrayObjectTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("Лабораторна робота №3. Варіант 13");

        Array1DTask.run();
        Array2DTask.run();
        JaggedArrayTask.run();
        ArrayObjectTask.run();
    }
}