package ua.sheveriuk.hw3;

import java.util.Scanner;

public class Task3 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку:");
    String input = scanner.nextLine();

    int wordCount = countWords(input);
    System.out.println("Количество слов в строке: " + wordCount);

    scanner.close();
}

    private static int countWords(String input) {
        // Разбиваем строку на слова, используя пробел как разделитель
        String[] words = input.split("\\s+");
        // Возвращаем количество слов
        return words.length;
    }
}
