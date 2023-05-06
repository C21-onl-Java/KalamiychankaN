package ru.teachmeskills.homework06.computer;

public class RAM {
    private String name;
    private int capacity;

    public RAM() {
    }

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void printInfo() {
        System.out.println("RAM: " + name);
        System.out.println("Capacity: " + capacity + "GB");
    }
}
