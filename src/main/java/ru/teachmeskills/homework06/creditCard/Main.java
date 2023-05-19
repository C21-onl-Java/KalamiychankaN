package ru.teachmeskills.homework06.creditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("4444-5555-6666-7777", 0.0);
        CreditCard card2 = new CreditCard("5555-7777-2222-4444", 0.0);
        CreditCard card3 = new CreditCard("1111-3333-4444-5555", 1000.0);

        card1.deposit(500);
        card2.deposit(600);
        card3.withdraw(300);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }

}
