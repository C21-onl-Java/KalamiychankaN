package ru.teachmeskills.homework09.task2;

public class Main {
    public static void main(String[] args) {
        double[] coordinates1 = {3, 4};
        Vector vector1 = new Vector(coordinates1);
        vector1.printInfo();

        double[] coordinates2 = {1, 2, 3};
        Vector vector2 = new Vector(coordinates2);
        vector2.printInfo();

        Vector[] randomVectors = Vector.generateRandomVectors(5, 4);
        System.out.println("Случайные векторы:");
        for (Vector v : randomVectors) {
            v.printInfo();
            System.out.println();
        }
    }
}
