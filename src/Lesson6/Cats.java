package Lesson6;
import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Iterator;

public class Cats {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Вася");
        list.add("Кузя");
        list.add("Мурчик");
        list.add("Симона");
        list.add("Соня");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.equals("Кузя")) {
                list.remove(list);
            }
        }

    }
}