package ru.teachmeskills.homework04;

import java.util.Arrays;

public class TwoArraysTask3 {
    public static void main(String[] args) {
        int array1[] = {0,1,4,5,6};
        int array2[] = {2,3,7,8,9};
        int summ1 = 0;
        int summ2 = 0;
        for (int i = 0; i < 5; i++){
            summ1+=array1[i];
            summ2+=array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Среднее ар. 1 массива " + summ1/5);
        System.out.println("Среднее ар. 2 массива " +summ2/5);
    }
}
