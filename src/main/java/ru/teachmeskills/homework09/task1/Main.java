package ru.teachmeskills.homework09.task1;

public class Main {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(3, 4);
        vector2D.printInfo();

        Vector3D vector3D = new Vector3D(1, 2, 3);
        vector3D.printInfo();

        Vector2D[] randomVectors2D = Vector2D.generateRandomVectors(5);
        System.out.println("Случайные векторы (2D):");
        for (Vector2D v : randomVectors2D) {
            v.printInfo();
            System.out.println();
        }

        Vector3D[] randomVectors3D = Vector3D.generateRandomVectors(5);
        System.out.println("Случайные векторы (3D):");
        for (Vector3D v : randomVectors3D) {
            v.printInfo();
            System.out.println();
        }
    }
}
