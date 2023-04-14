package ru.teachmeskills.homework03.cycle;

import java.util.Scanner;
public class Summ {
    public static void main(String[] args) {
            System.out.print("Введите любое целое положительное число: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int sum = 0;
            for (int i=1; i<= number; i++){
                sum = sum + i;
            }
            System.out.println (sum);
        }
    }