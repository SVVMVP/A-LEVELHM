package ua.sheveriuk.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int arraySize = 2000;
        int[] array = generateRandomArray(arraySize);

        int[] modifiedArray = replaceEvenWithZero(array);

        printArray("Масив після заміни четних значень на нулі:", modifiedArray);

        // Перевірка, що оригінальний масив не змінений
        printArray("Оригінальний масив:", array);
    }

    // Метод для генерації масиву випадкових чисел
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    // Метод для заміни парних значень в масиві на нулі і повернення зміненої копії масиву
    private static int[] replaceEvenWithZero(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length); // Копіюємо масив
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0) {
                newArray[i] = 0; // Замінюємо парні значення на нулі
            }
        }
        return newArray; // Повертаємо змінену копію масиву
    }

    // Метод для виводу масиву на екран
    private static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Після виводу кожного масиву додамо порожній рядок для зручності читання
    }
}
