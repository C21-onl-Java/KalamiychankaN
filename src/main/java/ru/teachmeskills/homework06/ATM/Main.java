package ru.teachmeskills.homework06.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(10, 30, 40);
        atm.addMoney(4, 5, 6);
        boolean success = atm.withdrawMoney(5000);
        if (success) {
            System.out.println("Деньги успешно сняты.");
        } else {
            System.out.println("Не удалось снять деньги.");
        }
    }
}
