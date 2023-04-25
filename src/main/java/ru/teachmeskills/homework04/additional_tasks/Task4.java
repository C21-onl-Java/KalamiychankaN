package ru.teachmeskills.homework04.additional_tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        while (size <= 5 || size > 10) {
            System.out.println("Неверное значение. Введите повторно");
            size = scanner.nextInt();
        }
        int array[] = new int[size];
        int even = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[even];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
//Есть ли возможность присвоить значения во второй массив во время одного только приенения метода for each?