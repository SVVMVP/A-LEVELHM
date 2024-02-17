package ua.sheveriuk.hw6;

public class Task1 { private String number;
    private String model;
    private double weight;

    // Конструктор, що приймає три параметри
    public void Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор, що приймає два параметри
    public void Phone(String number, String model) {
        this.number = number;
        this.model = model;
        // Значення weight залишається за замовчуванням (0.0)
    }

    // Конструктор без параметрів
    public void Phone() {
        // Значення всіх полів залишаються за замовчуванням (null, null, 0.0)
    }

    // Метод для отримання номеру телефона
    public String getNumber() {
        return number;
    }

    // Метод для отримання дзвінка
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public static void main(String[] args) {
        // Створення трьох екземплярів класу Phone
        HM6.Task1.Phone phone1 = new HM6.Task1.Phone("123456789", "Samsung", 150.0);
        HM6.Task1.Phone phone2 = new HM6.Task1.Phone("987654321", "iPhone");
        HM6.Task1.Phone phone3 = new HM6.Task1.Phone();

        // Присвоєння значень полям класу
        phone2.setWeight(200.0);
        phone3.setNumber("555555555");
        phone3.setModel("Nokia");
        phone3.setWeight(120.0);

        // Вивід на консоль значень полів кожного з об'єктів
        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.getModel() + ", " + phone1.getWeight() + "g");
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.getModel() + ", " + phone2.getWeight() + "g");
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.getModel() + ", " + phone3.getWeight() + "g");

        // Виклик методів для отримання дзвінка для кожного з об'єктів
        phone1.receiveCall("John");
        phone2.receiveCall("Alice");
        phone3.receiveCall("Bob");
    }

    // Метод для отримання ваги телефона
    public double getWeight() {
        return weight;
    }

    // Метод для отримання моделі телефона
    public String getModel() {
        return model;
    }

    // Додаткові методи встановлення значень
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
