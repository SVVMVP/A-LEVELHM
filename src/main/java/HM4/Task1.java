package HM4;

import java.util.Random;

public class Task1 {public static void main(String[] args) {
    // Задаємо розмір масиву
    int arraySize = 400;

    // Заповнюємо масив випадковими цілими числами в діапазоні від 1 до 10
    int[] array = new int[arraySize];
    Random random = new Random();
    for (int i = 0; i < arraySize; i++) {
        array[i] = random.nextInt(10) + 1;
    }

    // Знаходимо середнє арифметичне
    double averageArithmetic = calculateAverageArithmetic(array);
    System.out.println("Середнє арифметичне: " + averageArithmetic);

    // Знаходимо середнє геометричне
    double averageGeometric = calculateAverageGeometric(array);
    System.out.println("Середнє геометричне: " + averageGeometric);
}

    // Метод для знаходження середнього арифметичного
    private static double calculateAverageArithmetic(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    // Метод для знаходження середнього геометричного
    private static double calculateAverageGeometric(int[] array) {
        int product = 1;
        for (int value : array) {
            product *= value;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}
