package ru.teachmeskills.homework09.task2;

import java.util.Arrays;
import java.util.Random;

public class Vector {
    private double[] coordinates;

    public static final String DESCRIPTION = "Это вектор для системы координат произвольной размерности";

    public Vector(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public double getLength() {
        double sumOfSquares = 0.0;
        for (double coordinate : coordinates) {
            sumOfSquares += coordinate * coordinate;
        }
        return Math.sqrt(sumOfSquares);
    }

    public double getScalarProduct(Vector vector) {
        if (coordinates.length != vector.coordinates.length) {
            return 0.0;
        }

        double product = 0.0;
        for (int i = 0; i < coordinates.length; i++) {
            product += coordinates[i] * vector.coordinates[i];
        }
        return product;
    }

    public Vector subtract(Vector vector) {
        if (coordinates.length != vector.coordinates.length) {
            return null;
        }

        double[] result = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            result[i] = coordinates[i] - vector.coordinates[i];
        }
        return new Vector(result);
    }

    public static Vector[] generateRandomVectors(int n, int dimension) {
        Vector[] vectors = new Vector[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            double[] coordinates = new double[dimension];
            for (int j = 0; j < dimension; j++) {
                coordinates[j] = random.nextDouble();
            }
            vectors[i] = new Vector(coordinates);
        }

        return vectors;
    }

    public boolean isEqual(Vector vector) {
        if (coordinates.length != vector.coordinates.length) {
            return false;
        }

        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i] != vector.coordinates[i]) {
                return false;
            }
        }

        return true;
    }

    public void printInfo() {
        System.out.println(DESCRIPTION);
        System.out.println("Координаты вектора: " + Arrays.toString(coordinates));
        System.out.println("Длина вектора: " + getLength());
    }
}
