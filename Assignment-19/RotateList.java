import java.util.*;

public class RotateList {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Rotated List: " + rotateList(numbers, 2));
    }
	
    public static <T> List<T> rotateList(List<T> list, int positions) {
        int n = list.size();
        positions %= n;
        List<T> rotated = new ArrayList<>(list.subList(positions, n));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }
}
