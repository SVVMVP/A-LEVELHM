package ua.sheveriuk.hw7;

import java.util.Random;

public class Task1{
    public static void main(String[] args) {
        // Приклад використання класу Vector
        VECTOR v1 = new VECTOR(1, 2, 3);
        VECTOR v2 = new VECTOR(4, 5, 6);

        // Виклик методів класу для обчислення довжини, векторного добутку,
        // косинуса кута між векторами, суми та різниці векторів
        System.out.println("Довжина v1: " + v1.length());
        System.out.println("Довжина v2: " + v2.length());

        VECTOR crossProduct = v1.crossProduct(v2);
        System.out.println("Векторний добуток v1 і v2: (" + crossProduct.x + ", " + crossProduct.y + ", " + crossProduct.z + ")");

        double cosineAngle = v1.cosineAngle(v2);
        System.out.println("Косинус кута між v1 і v2: " + cosineAngle);

        VECTOR sum = v1.add(v2);
        System.out.println("Сума v1 і v2: (" + sum.x + ", " + sum.y + ", " + sum.z + ")");

        VECTOR difference = v1.subtract(v2);
        System.out.println("Різниця v1 і v2: (" + difference.x + ", " + difference.y + ", " + difference.z + ")");

        // Створення масиву випадкових векторів
        VECTOR[] randomVECTORS = VECTOR.randomVectors(3);
        System.out.println("Випадкові вектори:");
        for (VECTOR vector : randomVECTORS) {
            System.out.println("(" + vector.x + ", " + vector.y + ", " + vector.z + ")");
        }
    }
}

class VECTOR {
    public double x;
    public double y;
    public double z;

    // Конструктор з параметрами
    public VECTOR(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Метод для обчислення довжини вектора
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Метод для обчислення векторного добутку з іншим вектором
    public VECTOR crossProduct(VECTOR other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new VECTOR(newX, newY, newZ);
    }

    // Метод для обчислення косинуса кута між векторами
    public double cosineAngle(VECTOR other) {
        double dotProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = length() * other.length();
        return dotProduct / lengthProduct;
    }

    // Метод для обчислення суми векторів
    public VECTOR add(VECTOR other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new VECTOR(newX, newY, newZ);
    }

    // Метод для обчислення різниці векторів
    public VECTOR subtract(VECTOR other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new VECTOR(newX, newY, newZ);
    }

    // Статичний метод для створення масиву випадкових векторів
    public static VECTOR[] randomVectors(int N) {
        VECTOR[] VECTORS = new VECTOR[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            VECTORS[i] = new VECTOR(x, y, z);
        }
        return VECTORS;
    }
}
