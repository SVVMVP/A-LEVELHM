package ua.sheveriuk.hw3;

public class Task1 {public static void main(String[] args) {
    String originalString = "A man a plan a canal Panama";

    // Удаление пробелов из строки
    String stringWithoutSpaces = originalString.replaceAll("\\s+", "");

    // Проверка на палиндром
    boolean isPalindrome = checkPalindrome(stringWithoutSpaces);

    if (isPalindrome) {
        System.out.println("Строка является палиндромом.");
    } else {
        System.out.println("Строка не является палиндромом.");
    }
}

    // Метод для проверки строки на палиндром
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
