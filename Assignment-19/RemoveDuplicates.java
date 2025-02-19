import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
        List<Integer> duplicateList = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Without Duplicates: " + removeDuplicates(duplicateList));
    }
	
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }
}
