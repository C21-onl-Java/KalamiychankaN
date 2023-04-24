package ru.teachmeskills.homework05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество строк и столбцов");
        int rowCount = scanner.nextInt();
        int columnCount = scanner.nextInt();
        int[][] array = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                array[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("================");
        for (int i = 0; i < rowCount; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
