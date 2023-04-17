package ru.teachmeskills.homework04;

import java.util.Scanner;

public class NumberArrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int Search = scanner.nextInt();
        int nums[] = {22, 11, 12, 34, 53, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Search) {
                System.out.println("Число найдено");
            }
        }
    }
}
