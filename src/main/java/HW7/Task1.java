package HW7;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Приклад використання класу Vector
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);

        // Виклик методів класу для обчислення довжини, векторного добутку,
        // косинуса кута між векторами, суми та різниці векторів
        System.out.println("Довжина v1: " + v1.length());
        System.out.println("Довжина v2: " + v2.length());

        Vector crossProduct = v1.crossProduct(v2);
        System.out.println("Векторний добуток v1 і v2: (" + crossProduct.x + ", " + crossProduct.y + ", " + crossProduct.z + ")");

        double cosineAngle = v1.cosineAngle(v2);
        System.out.println("Косинус кута між v1 і v2: " + cosineAngle);

        Vector sum = v1.add(v2);
        System.out.println("Сума v1 і v2: (" + sum.x + ", " + sum.y + ", " + sum.z + ")");

        Vector difference = v1.subtract(v2);
        System.out.println("Різниця v1 і v2: (" + difference.x + ", " + difference.y + ", " + difference.z + ")");

        // Створення масиву випадкових векторів
        Vector[] randomVectors = Vector.randomVectors(3);
        System.out.println("Випадкові вектори:");
        for (Vector vector : randomVectors) {
            System.out.println("(" + vector.x + ", " + vector.y + ", " + vector.z + ")");
        }
    }
}

class Vector {
    public double x;
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
