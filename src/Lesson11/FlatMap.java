package Lesson11;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        String[] strings = {"Java", "Course"};

        Arrays.stream(strings)
                .map(string -> string.split(""))
                .flatMap(array -> Arrays.stream(array))
                .forEach(System.out::println);

        IntStream.range(0,10)
                .forEach(System.out::println);//выдаёт с нуля вкл по х не вкл
        System.out.println("------------------------");


        Stream.of(2,3,0,1,3)
                .flatMapToInt(number -> IntStream.range(0, number))
                .forEach(System.out::println);
        System.out.println("------------------------");

        Stream.of(2,3,0,1,3)
                .map(number -> IntStream.range(0, number))
                .limit(3)
                .forEach(System.out::println);
        System.out.println("------------------------");
        IntStream.range(0,10)
                .skip(5)
                .forEach(System.out::println);//выдаёт с нуля вкл по х не вкл
        System.out.println("------------------------");
        Stream.of(2,3,1,3)
                .distinct()
                .forEach(System.out::println);
        System.out.println("------------------------");




    }
}
