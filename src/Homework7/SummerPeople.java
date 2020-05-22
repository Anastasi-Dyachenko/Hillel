package Homework7;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SummerPeople {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "Brawn");
        map.put(2, "Stivenson");
        map.put(3, "Karnegy");
        map.put(4, "Black");
        map.put(5, "Churicova");
        map.put(6, "Pitt");
        map.put(7, "Depp");
        map.put(8, "Holland");
        map.put(8, "O'mally");
        map.put(9, "Terry");
        map.remove(6);
        map.remove(7);
        map.remove(8);
        System.out.println(map);
    }


    }
