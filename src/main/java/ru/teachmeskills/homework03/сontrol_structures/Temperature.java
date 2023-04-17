package ru.teachmeskills.homework03.сontrol_structures;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("Тепло");
        } else if (temp <= -5 && temp > -20) { //я не понимаю почему тут ворнинг temp <= -5 always "true"//
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
