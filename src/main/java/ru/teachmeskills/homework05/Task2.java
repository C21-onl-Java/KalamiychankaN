package ru.teachmeskills.homework05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}