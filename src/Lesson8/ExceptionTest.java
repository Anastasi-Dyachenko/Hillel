package Lesson8;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            method1();
            method3();
        } catch (ArithmeticException e) {
            System.out.println("kd");

        } catch (Exception e) {
            System.out.println("exception " + e.getMessage());
            e.printStackTrace();
        }

        method2();

    }

    public static void method1() {

        int i = 10 / 0;
        throw new RuntimeException("My ");
    }

    public static void method2() {
        System.out.println("Importinfo");
    }

    public static void method3() {
        Object object = null;
        object.toString();
    }
}
