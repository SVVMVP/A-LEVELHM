package ua.sheveriuk.hw4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int arraySize = 2000;
        int[] array = generateRandomArray(arraySize);

        replaceEvenWithZero(array);

        printArray("Масив після заміни четних значень на нулі:", array);
    }

    // Метод для генерации массива случайных чисел
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    // Метод для замены четных значений в массиве на нули
    private static void replaceEvenWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }

    // Метод для вывода массива на экран
    private static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
