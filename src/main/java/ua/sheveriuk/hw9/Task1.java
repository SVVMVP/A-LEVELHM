package ua.sheveriuk.hw9;

public class Task1 {  public static void main(String[] args) {
    try {
        throw new Exception("This is an example of throwing an exception!");
    } catch (Exception e) {
        System.out.println("Caught exception: " + e.getMessage());
    } finally {
        System.out.println("Finally block: Program execution completed");
    }
}
}


