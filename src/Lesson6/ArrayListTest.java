package Lesson6;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i <10; i++){
           list.add(i);
       }

        for (int i =0; i <list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        list.remove (3);
        System.out.println();
for (Integer number: list) {
    System.out.print(number);
}
        System.out.println();
if (list.contains(5)){}
        System.out.println("ytrtry");
    }

}
