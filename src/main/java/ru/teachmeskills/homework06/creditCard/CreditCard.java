package ru.teachmeskills.homework06.creditCard;

public class CreditCard {
    private String accNum;
    private double balance;

    public CreditCard(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    public void printInfo() {
        System.out.println("Номер счета " + accNum);
        System.out.println("Баланс на текущий момент " + balance);
    }
}
