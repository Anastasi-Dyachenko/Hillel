package Lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        strings.add("Seven");
        strings.add("Eight");
        strings.add("Nine");
        strings.add("Ten");

        strings.stream()
                .filter(string -> string.length() == 3)
                .map(Dog::new)
                .forEach(System.out::println);
strings.stream()
        .sorted(Comparator.comparing(String::length))
        .forEach(System.out::println);
        Map<String,List<Dog>> map = strings.stream()
                .filter(string -> string.length()==3)
                .map(Dog::new)
                .collect(Collectors.groupingBy(Dog::getName));

        map.forEach((key,value)-> System.out.println(key = " " + value));
    }

    public static class Dog {
        String name;

        public Dog(String name) {

            this.name = "Dog" + name;
        }
        @Override
        public String toString(){
            return "Dog { "+
                    "name = " + name + " }";
        }
        public String getName() {
            return  name;
        }
    }
}
