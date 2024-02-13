package HM2;

public class Task3 { public static void main(String[] args) {
    // Задаємо три  числа
    double number1 = -5;
    double number2 = 7;
    double number3 = 11;

    // Знаходимо менше за модулем число
    double minByModulus = Math.min(Math.min(Math.abs(number1), Math.abs(number2)), Math.abs(number3));

    // Виводимо число (не модуль) на екран
    if (Math.abs(number1) == minByModulus) {
        System.out.println("Виводимо число " + number1);
    } else if (Math.abs(number2) == minByModulus) {
        System.out.println("Виводимо число " + number2);
    } else {
        System.out.println("Виводимо число " + number3);
    }
}
}

