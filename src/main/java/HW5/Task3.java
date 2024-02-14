package HW5;

public class Task3 {public static void main(String[] args) {
    // Заданий масив
    int[][] originalArray = {
            {1, 2, 1, 3},
            {3, 4, 2, 4}
    };

    // Обмін стовпців та рядків
    int[][] modifiedArray = swapRowsAndColumns(originalArray);

    // Вивід результату
    System.out.println("До:");
    printArray(originalArray);
    System.out.println("Після:");
    printArray(modifiedArray);
}

    // Метод для обміну стовпців та рядків у новому масиві
    private static int[][] swapRowsAndColumns(int[][] array) {
        int n = array.length; // кількість рядків або стовпців
        int[][] resultArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultArray[i][j] = array[j][i];
            }
        }

        return resultArray;
    }

    // Метод для виведення двовимірного масиву
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
