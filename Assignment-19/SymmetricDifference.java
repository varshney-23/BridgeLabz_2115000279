import java.util.*;

public class SymmetricDifference {
	
	public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Symmetric Difference: " + helper(set1, set2));
    }
	
    public static <T> Set<T> helper(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);

        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        result.removeAll(intersection);
        return result;
    }
}
