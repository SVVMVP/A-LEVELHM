package HW11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Task2 { public static void main(String[] args) {
    List<String> stringList = List.of("тут", "там", "стол");

    Map<Integer, List<String>> resultMap = getStringLengthMap(stringList);

    // Выводим результаты
    System.out.println("Результат:");
    for (Map.Entry<Integer, List<String>> entry : resultMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

    // Метод для создания Map с количеством букв в строке в качестве ключа и списком строк в качестве значения
    private static Map<Integer, List<String>> getStringLengthMap(List<String> stringList) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (String str : stringList) {
            int length = str.length();
            if (!resultMap.containsKey(length)) {
                resultMap.put(length, new ArrayList<>());
            }
            resultMap.get(length).add(str);
        }
        return resultMap;
    }
}
