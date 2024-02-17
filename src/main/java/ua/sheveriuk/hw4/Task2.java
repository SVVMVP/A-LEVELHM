package ua.sheveriuk.hw4;

import java.util.Random;

public class Task2 {
    public static class Main {
        public static void main(String[] args) {
            // Задаємо розмір масиву
            int arraySize = 1000;

            // Заповнюємо масив випадковими цілими числами
            int[] array = new int[arraySize];
            Random random = new Random();
            for (int i = 0; i < arraySize; i++) {
                array[i] = random.nextInt(100) + 1; // Ви можете змінити діапазон відповідно до вашого завдання
            }

            // Знаходимо кількість простих чисел у масиві
            int primeCount = countPrimes(array);
            System.out.println("Кількість простих чисел в масиві: " + primeCount);
        }

        // Метод для перевірки, чи є число простим
        private static boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Метод для підрахунку кількості простих чисел у масиві
        private static int countPrimes(int[] array) {
            int count = 0;
            for (int value : array) {
                if (isPrime(value)) {
                    count++;
                }
            }
            return count;
        }
    }

}