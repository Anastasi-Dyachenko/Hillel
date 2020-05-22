package lesson7;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> strings = new Stack<>();
        strings.push(1);
        strings.push(2);
        strings.push(3);
        strings.push(14);

        System.out.println("on the top "+ strings.peek());
        System.out.println("size " + strings.size());
        System.out.println(strings.pop());
        System.out.println("get top " + strings.size());
    }
}
