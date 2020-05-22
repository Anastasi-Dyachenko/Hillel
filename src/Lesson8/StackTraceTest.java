package Lesson8;

public class StackTraceTest {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
        for (StackTraceElement element : stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }

    public static void method1() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("method1");
        for (StackTraceElement element : stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }
    public static void method2() {
        method3();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("method2");
        for (StackTraceElement element : stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }
    public static void method3() {
        method2();
        System.out.println("method3");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println("end method");
        for (StackTraceElement element : stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }


}