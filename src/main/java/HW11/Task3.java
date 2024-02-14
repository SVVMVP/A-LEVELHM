package HW11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Task3 {private static final int ELEMENTS_COUNT = 1_000_000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавление элементов в ArrayList
        long startTimeArrayList = System.currentTimeMillis();
        addElements(arrayList);
        long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Время добавления элементов в ArrayList: " + (endTimeArrayList - startTimeArrayList) + " мс");

        // Добавление элементов в LinkedList
        long startTimeLinkedList = System.currentTimeMillis();
        addElements(linkedList);
        long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("Время добавления элементов в LinkedList: " + (endTimeLinkedList - startTimeLinkedList) + " мс");

        // Выбор элементов наугад из заполненного списка
        long startTimeRandomAccessArrayList = System.currentTimeMillis();
        randomAccess(arrayList);
        long endTimeRandomAccessArrayList = System.currentTimeMillis();
        System.out.println("Время выбора элементов наугад из ArrayList: " + (endTimeRandomAccessArrayList - startTimeRandomAccessArrayList) + " мс");

        long startTimeRandomAccessLinkedList = System.currentTimeMillis();
        randomAccess(linkedList);
        long endTimeRandomAccessLinkedList = System.currentTimeMillis();
        System.out.println("Время выбора элементов наугад из LinkedList: " + (endTimeRandomAccessLinkedList - startTimeRandomAccessLinkedList) + " мс");
    }

    // Метод для добавления элементов в список
    private static void addElements(List<Integer> list) {
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(random.nextInt());
        }
    }

    // Метод для выбора элементов наугад из списка
    private static void randomAccess(List<Integer> list) {
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            int index = random.nextInt(list.size());
            list.get(index);
        }
    }
}
