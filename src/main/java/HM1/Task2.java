package HM1;

public class Task2 {public static void main(String[] args) {
    int a = 1;
    int b = 2;

    System.out.println("До обміну: a = " + a + ", b = " + b);

    // Використовуємо тимчасову змінну для обміну значень
    int temp = a;
    a = b;
    b = temp;

    System.out.println("Після обміну: a = " + a + ", b = " + b);
}
}
