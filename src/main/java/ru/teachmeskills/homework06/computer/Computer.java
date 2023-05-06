package ru.teachmeskills.homework06.computer;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double price, String model){
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }
    public Computer(double price, String model, RAM ram, HDD hdd){
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void printInfo(){
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        ram.printInfo();
        hdd.printInfo();
    }
}
