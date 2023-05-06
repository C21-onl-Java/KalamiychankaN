package ru.teachmeskills.homework06.computer;

public class HDD {
    private String name;
    private int capacity;
    private String type;

    public HDD(){
    }
    public HDD(String name,int capacity, String type){
        this.name=name;
        this.capacity=capacity;
        this.type=type;
    }
    public void printInfo(){
        System.out.println("HDD " + name);
        System.out.println("Capacity " + capacity);
        System.out.println("HDD type " + type);
    }
}
