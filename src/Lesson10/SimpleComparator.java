package Lesson10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SimpleComparator {
    public static void main(String[] args) {

        String[] array1 = {"dog", "Cat", "Nice"};
        String[] array2 = {"dop", "Calendar", "cool"};
        String[] array3 = {"dad", "Cactus", "Rice"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        Comparator<String[]> compareByLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length- o2.length;
            }
        };
        Comparator<String[]> compareBeWordsLength = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return 0;
            }
        } ;
    }
}