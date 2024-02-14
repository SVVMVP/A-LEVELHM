package HW10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    // Method to return the sum of elements in the list
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method to return a new list of odd numbers
    public static List<Integer> getOddNumber(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    // Method to return a new list of strings
    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }

    // Method to return a new list where each string is doubled and concatenated
    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String str : strings) {
            doubledList.add(str + str);
        }
        return doubledList;
    }

    public static void main(String[] args) {
        // Example usage of ListUtils class methods
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of elements in the list: " + getSum(numbers));

        List<Integer> oddNumbers = getOddNumber(numbers);
        System.out.println("New list of odd numbers: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("New list of strings: " + stringList);

        List<String> doubledList = doubling(stringList);
        System.out.println("New list with doubled strings: " + doubledList);
    }
}