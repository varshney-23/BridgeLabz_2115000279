import java.util.*;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int popped = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }

    public int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        int top = q1.poll();
        q2.offer(top);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(14);
        stack.push(26);
        stack.push(37);
        System.out.println("Popped: " + stack.pop());
    }
}
