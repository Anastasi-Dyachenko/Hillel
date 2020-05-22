package Lesson8;

public class StackTest2 {
    public static void main(String[] args) {

        method1();

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        System.out.println("main");

        for (StackTraceElement element: stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }

    public static void method1() {

        method2();

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        System.out.println("method1");

        for (StackTraceElement element: stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }

    public static void method2() {

        method2();

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        System.out.println("method1");

        for (StackTraceElement element: stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }

    public static void method3() {

        method2();

        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        System.out.println("method1");

        for (StackTraceElement element: stackTrace) {
            System.out.println(element.getClassName() + " " + element.getFileName()
                    + " " + element.getMethodName() + " " + element.getLineNumber());
        }
    }
}
