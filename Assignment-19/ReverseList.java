import java.util.*;

public class ReverseList {
	public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
	
    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        for (T item : list) {
            reversed.addFirst(item);
        }
        return reversed;
    }
}
