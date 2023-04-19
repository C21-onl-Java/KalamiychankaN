package ru.teachmeskills.homework04;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int remove = scanner.nextInt();
        int nums[] = {22, 11, 12, 34, 53, 1, 2, 3, 4, 5, 6, 7};
        int noNum = 0; //переменная, меняющая значение в случае отсуствия совпадения
        int j = 0; // счетчик 2 массива
        for (int i = 0; i < nums.length; i++) {
            if (remove == nums[i]) {
                noNum++;
            }
        }
        if (noNum == 0) {
            System.out.println("Число не найдено");
        } else {
            int[] removedNum = new int[nums.length - noNum];
            for (int i = 0; i < nums.length; i++){
               if (nums[i]!=remove){
                   removedNum[j]=nums[i];
                   j++;
               }
           }
            System.out.println(Arrays.toString(removedNum));
        }
    }
}