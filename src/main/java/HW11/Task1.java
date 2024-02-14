package HW11;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Task1 { public static void main(String[] args) {
    List<String> stringList = List.of("тут", "там", "стол");

    Map<String, Integer> resultMap = countStringLength(stringList);

    // Выводим результаты
    System.out.println("Результат:");
    for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

    // Метод для подсчета длины каждой строки в списке и создания Map
    private static Map<String, Integer> countStringLength(List<String> stringList) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : stringList) {
            resultMap.put(str, str.length());
        }
        return resultMap;
    }
}
