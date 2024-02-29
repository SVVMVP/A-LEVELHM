package ua.sheveriuk.hw15;

import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Task1 {
    public static void main(String[] args) throws Exception {
        // Отримуємо конструктор класу A
        Constructor<A> constructor = A.class.getDeclaredConstructor();
        // Дозволяємо доступ до приватного конструктора
        constructor.setAccessible(true);
        // Створюємо екземпляр класу A
        A instance = constructor.newInstance();

        // Змінюємо значення змінних за допомогою рефлексії
        Field idField = A.class.getDeclaredField("id");
        Field nameField = A.class.getDeclaredField("name");
        idField.setAccessible(true);
        nameField.setAccessible(true);
        idField.set(instance, "261");
        nameField.set(instance, "S");

        // Виводимо змінений об'єкт
        System.out.println(instance);
    }

    static class A {
        private String id = "123";
        private String name = "A";

        private A() {
        }

        @Override
        public String toString() {
            return "A{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
