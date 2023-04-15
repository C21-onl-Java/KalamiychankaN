package ru.teachmeskills.homework02;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("Введите имя пользователя");
        Scanner username = new Scanner(System.in);
        String username_str = username.nextLine();
        System.out.printf("Привет - %s! Добро пожаловать!", username_str);
    }
}
