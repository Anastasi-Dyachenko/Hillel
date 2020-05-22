package lesson7;

public class Generics {
    public static void main(String[] args) {

    }

    public static <T> T getSomething(T a) {
        return a;
    }

    public static <T> void getSomething2(T a) {
        System.out.println(a);
    }
}