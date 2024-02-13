package HM4;

import java.util.Random;

public class Task3 { public static class Main {
    public static void main(String[] args) {
        // Задаємо розмір масиву
        int arraySize = 2000;

        // Заповнюємо масив випадковими цілими числами
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100) + 1; // Ви можете змінити діапазон відповідно до вашого завдання
        }

        // Замінюємо всі четні значення на нулі
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }

        // Виводимо змінений масив
        System.out.println("Масив після заміни четних значень на нулі:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
}
