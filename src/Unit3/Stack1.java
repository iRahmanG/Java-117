package Unit3;

import java.sql.SQLOutput;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.push("First");
        stk.push("Second");
        stk.push("Third");
        System.out.println(stk.pop());
        System.out.println(stk.isEmpty());
    }
}
