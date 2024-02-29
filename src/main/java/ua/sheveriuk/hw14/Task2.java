package ua.sheveriuk.hw14;

public class Task2 {  public static void main(String[] args) throws InterruptedException {
    int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; // Приклад масиву чисел

    // Створюємо два потоки для підрахунку простих чисел
    PrimeCounterThread thread1 = new PrimeCounterThread(numbers, 0, numbers.length / 2);
    PrimeCounterThread thread2 = new PrimeCounterThread(numbers, numbers.length / 2, numbers.length);

    // Запускаємо потоки
    thread1.start();
    thread2.start();

    // Чекаємо, доки обидва потоки завершаться
    thread1.join();
    thread2.join();

    // Підраховуємо загальну кількість простих чисел
    int totalPrimes = thread1.getCount() + thread2.getCount();

    // Виводимо результат
    System.out.println("Total prime numbers: " + totalPrimes);
}
}

class PrimeCounterThread extends Thread {
    private final int[] numbers;
    private final int startIndex;
    private final int endIndex;
    private int count; // Лічильник простих чисел

    public PrimeCounterThread(int[] numbers, int startIndex, int endIndex) {
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
    }

    public int getCount() {
        return count;
    }

    // Функція для перевірки, чи є число простим
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
