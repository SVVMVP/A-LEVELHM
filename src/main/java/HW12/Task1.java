package HW12;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task1 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder csvContent = new StringBuilder();

    System.out.println("Введите текст (для завершения введите 'end'): ");

    while (true) {
        String line = scanner.nextLine().trim();

        if (line.equalsIgnoreCase("end")) {
            break;
        } else if (line.equalsIgnoreCase("next")) {
            csvContent.append("\n");
        } else {
            csvContent.append(line).append(", ");
        }
    }

    try {
        writeCSVFile(csvContent.toString());
        System.out.println("CSV файл успешно создан.");
    } catch (IOException e) {
        System.err.println("Ошибка при создании CSV файла: " + e.getMessage());
    } finally {
        scanner.close();
    }
}

    private static void writeCSVFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"))) {
            writer.write(content);
        }
    }
}
