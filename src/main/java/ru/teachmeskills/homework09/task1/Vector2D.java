package ru.teachmeskills.homework09.task1;

import java.util.Random;

public class Vector2D {
    protected double x;
    protected double y;

    public static final String DESCRIPTION = "Это вектор для двумерной системы координат";

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double getScalarProduct(Vector2D vector) {
        return x * vector.x + y * vector.y;
    }

    public Vector2D subtract(Vector2D vector) {
        double newX = x - vector.x;
        double newY = y - vector.y;
        return new Vector2D(newX, newY);
    }

    public static Vector2D[] generateRandomVectors(int n) {
        Vector2D[] vectors = new Vector2D[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            vectors[i] = new Vector2D(x, y);
        }

        return vectors;
    }

    public boolean isEqual(Vector2D vector) {
        return x == vector.x && y == vector.y;
    }

    public void printInfo() {
        System.out.println(DESCRIPTION);
        System.out.println("Координаты вектора: (" + x + ", " + y + ")");
        System.out.println("Длина вектора: " + getLength());
    }
}