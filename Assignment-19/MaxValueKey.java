import java.util.*;

public class MaxValueKey {
	public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println("Key with highest value: " + getMaxKey(map));
    }
	
    public static <K, V extends Comparable<V>> K getMaxKey(Map<K, V> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
