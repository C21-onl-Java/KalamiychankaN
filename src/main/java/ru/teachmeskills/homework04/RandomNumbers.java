package ru.teachmeskills.homework04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        System.out.println("Макс. значение " + array[size - 1]);
        System.out.println("Среднее значение " + array[size / 2]);
        System.out.println("Минимальное значение " + array[0]);
    }
}