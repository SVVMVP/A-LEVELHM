package HW8;

public class Task1 {
    public static void main(String[] args) {
        // Створення масиву, що містить об'єкти класів Student та Aspirant
        Student[] students = new Student[3];
        students[0] = new Student("John", "Doe", "GroupA", 4.5);
        students[1] = new Aspirant("Jane", "Smith", "GroupB", 5.0, "Research");
        students[2] = new Aspirant("Alice", "Johnson", "GroupC", 4.8, "Thesis");

        // Виклик методу getScholarship() для кожного студента в масиві
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + ": " + student.getScholarship() + " грн");
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    // Метод для отримання стипендії
    public double getScholarship() {
        if (averageMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }
}

class Aspirant extends Student {
    private String research;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String research) {
        super(firstName, lastName, group, averageMark);
        this.research = research;
    }

    public String getResearch() {
        return research;
    }

    // Перевизначений метод для отримання стипендії для аспірантів
    @Override
    public double getScholarship() {
        if (getAverageMark() == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }
}
