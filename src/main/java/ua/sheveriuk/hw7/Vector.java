package ua.sheveriuk.hw7;

import java.util.Random;

public class Vector { public double x;
    public double y;
    public double z;

    // Конструктор з параметрами
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Метод для обчислення довжини вектора
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Метод для обчислення векторного добутку з іншим вектором
    public Vector crossProduct(Vector other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Vector(newX, newY, newZ);
    }

    // Метод для обчислення косинуса кута між векторами
    public double cosineAngle(Vector other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = length() * other.length();
        return dotProduct / lengthProduct;
    }

    // Метод для обчислення суми векторів
    public Vector add(Vector other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new Vector(newX, newY, newZ);
    }

    // Метод для обчислення різниці векторів
    public Vector subtract(Vector other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new Vector(newX, newY, newZ);
    }

    // Статичний метод для створення масиву випадкових векторів
    public static Vector[] randomVectors(int N) {
        Vector[] vectors = new Vector[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Vector(x, y, z);
        }
        return vectors;
    }
}
