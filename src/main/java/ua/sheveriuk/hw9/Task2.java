package ua.sheveriuk.hw9;

public class Task2 {   public void f() throws Exception {
    try {
        g();
    } catch (Exception e) {
        throw new Exception("Exception thrown from f() method", e);
    }
}

    public void g() throws Exception {
        throw new Exception("Exception thrown from g() method");
    }

    public static void main(String[] args) {
        HW9.Task2 myObject = new HW9.Task2();
        try {
            myObject.f();
        } catch (Exception e) {
            System.out.println("Caught exception in main(): " + e.getMessage());
        }
    }
}
