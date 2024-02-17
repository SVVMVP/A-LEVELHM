package ua.sheveriuk.hw3;

public class Task2 { public static void main(String[] args) {
    String inputString = "Это пример строки, содержащей несколько слов";

    // Подсчет количества слов в строке
    int wordCount = countWords(inputString);

    System.out.println("Количество слов в строке: " + wordCount);
}

    // Метод для подсчета количества слов в строке
    private static int countWords(String str) {
        // Разбиваем строку на слова, используя пробел как разделитель
        String[] words = str.split("\\s+");

        // Возвращаем количество слов
        return words.length;
    }
}
