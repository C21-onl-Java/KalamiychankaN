package ru.teachmeskills.homework08.Task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Model 1", 0.3);
        Phone phone2 = new Phone("987654321", "Model 2");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight());

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight());

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight());

        phone1.receiveCall("John");
        phone2.receiveCall("Alice");
        phone3.receiveCall("Bob");

        phone1.sendMessage("111111", "222222");
        phone2.sendMessage("333333", "444444", "555555");
        phone3.sendMessage("666666");
    }
}