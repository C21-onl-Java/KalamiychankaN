package ru.teachmeskills.homework03.additional_tasks;

import java.util.Scanner;

public class BankTask {
    public static void main(String[] args) {
        Scanner scanner_summa = new Scanner(System.in);
        System.out.println("Введите сумму");
        float summa = scanner_summa.nextFloat();
        float summa_start = summa;
        Scanner scanner_month = new Scanner(System.in);
        System.out.println("Введите количество месяцев");
        int month = scanner_month.nextInt();
        for (int i = 0; i <= month; i++) {
            summa = summa + summa / 100 * 7;
            System.out.println("Сумма в " + (i + 1) + " месяце " + summa);
        }
        System.out.println("Итоговая сумма составила " + summa);
        System.out.println("Прибыль от вклада " + (summa - summa_start));
    }
}
