import java.util.*;

public class SubsetCheck {
	public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Is Subset: " + helperboolean(set1, set2));
    }
	
    public static <T> boolean helperboolean(Set<T> subset, Set<T> superset) {
        return superset.containsAll(subset);
    }
}
