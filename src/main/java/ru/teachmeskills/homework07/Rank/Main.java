package ru.teachmeskills.homework07.Rank;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.printRank();
        worker.printRank();
        accountant.printRank();
    }
}
