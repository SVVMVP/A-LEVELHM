package dtgffh;

public class Task1{ public static void main(String[] args) {
    // Задаємо координати вершин  A, B, C
    double xA = 1, yA = 5;
    double xB = 3, yB = 5;
    double xC = 6, yC = 7;

    // Розрахунок площі
    double area = 0.5 * Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB));

    // Вивід площі у консоль
    System.out.println("Площа треугольника: " + area);
}
}
