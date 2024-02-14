package HW6;

//Під час виконання циклу for виводиться кількість рядків у triangle (що завжди рівне 5), тобто ми бачимо triangle.length + "!". Проблема полягає в тому, що ми не друкуючи кількість рядків, а ми маємо надрукувати кількість елементів у кожному рядку.
//
//Для виправлення помилки на рядку 11 замінимо triangle.length на triangle[i].length
public class Task2 {
    public static void main(String[] args) {
        int[][] triangle = new int[5][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }
    }
}

