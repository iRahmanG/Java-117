package Unit3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<Integer> dq  = new ArrayDeque<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.addFirst(-1);
        dq.addLast(4);
        System.out.println(dq);
        dq.offer(0);
        dq.offerFirst(5);
        dq.offerLast(10);
        System.out.println(dq);
    }
}
