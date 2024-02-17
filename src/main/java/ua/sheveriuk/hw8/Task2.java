package ua.sheveriuk.hw8;

public class Task2 {public static void main(String[] args) {
    // Реалізація функціонального інтерфейсу через лямбда-вираз
    Pow pow = (number, power) -> {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    };

    // Приклад використання функціонального інтерфейсу
    int number = 2;
    int power = 3;
    int result = pow.pow(number, power);
    System.out.println(number + " в степені " + power + " = " + result);
}
}

// Функціональний інтерфейс для піднесення числа до степені
interface Pow {
    int pow(int number, int pow);
}
