package HW5;

public class Task1 { public static void main(String[] args) {
    // Задаємо розмір двовимірного масиву
    int rows = 4;
    int cols = 3;

    // Створюємо двовимірний масив та заповнюємо його
    int[][] array = new int[rows][cols];
    fillArray(array);

    // Виводимо отриманий масив
    printArray(array);
}

    // Метод для заповнення двовимірного масиву вказаним чином
    private static void fillArray(int[][] array) {
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i % 2 == 0) ? counter : -counter;
                counter++;
            }
        }
    }

    // Метод для виведення двовимірного масиву
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
