package ru.teachmeskills.homework09.task1;

import java.util.Random;

public class Vector3D extends Vector2D {
    private double z;

    public static final String DESCRIPTION = "Это вектор для трехмерной системы координат";

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double getScalarProduct(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector3D subtract(Vector3D vector) {
        double newX = x - vector.x;
        double newY = y - vector.y;
        double newZ = z - vector.z;
        return new Vector3D(newX, newY, newZ);
    }

    public static Vector3D[] generateRandomVectors(int n) {
        Vector3D[] vectors = new Vector3D[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Vector3D(x, y, z);
        }

        return vectors;
    }

    @Override
    public boolean isEqual(Vector2D vector) {
        if (vector instanceof Vector3D) {
            Vector3D other = (Vector3D) vector;
            return x == other.x && y == other.y && z == other.z;
        }
        return false;
    }

    @Override
    public void printInfo() {
        System.out.println(DESCRIPTION);
        System.out.println("Координаты вектора: (" + x + ", " + y + ", " + z + ")");
        System.out.println("Длина вектора: " + getLength());
    }
}
