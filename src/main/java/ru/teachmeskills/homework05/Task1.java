package ru.teachmeskills.homework05;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива (строки, столбцы, глубина: ");
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int size3 = scanner.nextInt();
        System.out.println("Введите число");
        int number = scanner.nextInt();
        Random random = new Random();
        int[][][] array = new int[size1][size2][size3];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    array[i][j][k] = random.nextInt(20);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                for (int k = 0; k < size3; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}