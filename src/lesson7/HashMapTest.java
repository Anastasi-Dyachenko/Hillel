package lesson7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apples", 10);
        map.put("Bananas", 20);

        System.out.println(map.size()+" size");
        System.out.println(map.get(" apples"));

        map.put("apples", 7);

        System.out.println(map.size()+" size");
        System.out.println(map.get("apples")+ " apples");
        map.put(null, 10);


    }
}
