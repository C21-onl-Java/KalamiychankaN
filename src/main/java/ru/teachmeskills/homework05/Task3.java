package ru.teachmeskills.homework05;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(Arrays.toString(array3[i]));
        }
    }
}
