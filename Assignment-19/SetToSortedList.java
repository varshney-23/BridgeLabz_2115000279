import java.util.*;

public class SetToSortedList {
	
	public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(helper(numbers));
    }
	
    public static List<Integer> helper(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
