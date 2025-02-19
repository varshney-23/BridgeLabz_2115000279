import java.util.*;

public class NthFromEnd {
	public static void main(String[] args) {
        LinkedList<String> letterList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Nth from End: " + findNthFromEnd(letterList, 2));
    }
	
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        for (int i = 0; i < n; i++) {
            if (first.hasNext()) first.next();
            else return null;
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
}
