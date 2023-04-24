package ru.teachmeskills.homework05;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);
                sum += array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(sum);
    }
}