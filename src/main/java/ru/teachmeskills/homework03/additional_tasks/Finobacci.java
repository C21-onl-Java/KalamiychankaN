package ru.teachmeskills.homework03.additional_tasks;

public class Finobacci {
    public static void main(String[] args) {
        int num0 = 0;
        int num1 = 1;
        int f_num;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= 11; i++) {
            f_num = num0 + num1;
            System.out.print(f_num + " ");
            num0 = num1;
            num1 = f_num;
        }
    }
}

