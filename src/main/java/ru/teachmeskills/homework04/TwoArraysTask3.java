package ru.teachmeskills.homework04;

import java.util.Arrays;

public class TwoArraysTask3 {
    public static void main(String[] args) {
        int array1[] = {0,1,4,5,6};
        int array2[] = {2,3,7,8,9};
        double average1 = 0;
        int average2 = 0;
        for (int i = 0; i < 5; i++){
            average1+=array1[i];
            average2+=array2[i];
        }
        average1/=5;
        average2/=5;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Среднее ар. 1 массива " + average1);
        System.out.println("Среднее ар. 2 массива " + average2);
        if (average1 > average2){
            System.out.println("Среднее ар. 1 массива больше");
        } else if (average2 > average1){
            System.out.println("Среднее ар. 2 массива больше");
        } else {
            System.out.println("Средние ар. - равны");
        }
    }
}
