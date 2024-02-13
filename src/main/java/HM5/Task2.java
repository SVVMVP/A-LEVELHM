package HM5;

public class Task2 {public static void main(String[] args) {
    // Заданий масив
    int[] array = {10, 8, 5, 3, 1};

    // Перевірка на упорядкованість за спаданням
    boolean isDescending = checkDescendingOrder(array);

    // Вивід результату
    if (isDescending) {
        System.out.println("Масив упорядкований за спаданням.");
    } else {
        System.out.println("Масив не упорядкований за спаданням.");
    }
}

    // Метод для перевірки упорядкованості за спаданням
    private static boolean checkDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
}
