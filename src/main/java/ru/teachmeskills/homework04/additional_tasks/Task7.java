package ru.teachmeskills.homework04.additional_tasks;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int temp;
        boolean done = false;
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        while (!done) {
            done = true;
            for (int i = 0; i < array.length - 1; i++) {
                temp = array[i];
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    done = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
