package ru.teachmeskills.homework06.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "HP");
        computer1.printInfo();
        System.out.println("============");
        RAM ram2 = new RAM("Kingston", 16);
        HDD hdd2 = new HDD("Seagate", 1000, "internal");
        Computer computer2 = new Computer(2000, "MacBook PRO ", ram2, hdd2);
        computer2.printInfo();
    }
}
