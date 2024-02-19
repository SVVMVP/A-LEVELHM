package HW10;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {  public static void main(String[] args) {
    // Створюємо ArrayList та додаємо елементи
    ArrayList<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    list.add("Four");
    list.add("Five");

    // Обхід ArrayList за допомогою циклу for
    System.out.println("Обхід ArrayList за допомогою циклу for:");
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }

    // Обхід ArrayList за допомогою циклу for-each
    System.out.println("\nОбхід ArrayList за допомогою циклу for-each:");
    for (String element : list) {
        System.out.println(element);
    }

    // Обхід ArrayList за допомогою циклу while
    System.out.println("\nОбхід ArrayList за допомогою циклу while:");
    int index = 0;
    while (index < list.size()) {
        System.out.println(list.get(index));
        index++;
    }

    // Обхід ArrayList за допомогою ітератора
    System.out.println("\nОбхід ArrayList за допомогою ітератора:");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}
}
