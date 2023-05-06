package ru.teachmeskills.homework06.ATM;

public class ATM {
    private int num20;
    private int num50;
    private int num100;

    public ATM(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public void addMoney(int num20, int num50, int num100) {
        this.num20 += num20;
        this.num50 += num50;
        this.num100 += num100;
    }

    public boolean withdrawMoney(int amount) {
        int totalAmount = amount;
        int num100withdraw = Math.min(totalAmount / 100, num100);
        totalAmount -= num100withdraw * 100;

        int num50withdraw = Math.min(totalAmount / 50, num50);
        totalAmount -= num50withdraw * 50;

        int num20withdraw = Math.min(totalAmount / 20, num20);
        totalAmount -= num20withdraw * 20;

        if (totalAmount == 0) {
            num100 -= num100withdraw;
            num50 -= num50withdraw;
            num20 -= num20withdraw;

            System.out.println("Выдано купюр номиналом 100: " + num100withdraw);
            System.out.println("Выдано купюр номиналом 50: " + num50withdraw);
            System.out.println("Выдано купюр номиналом 20: " + num20withdraw);
            return true;
        } else {
            System.out.println("Невозможно выдать указанную сумму.");
            return false;
        }
    }
}
