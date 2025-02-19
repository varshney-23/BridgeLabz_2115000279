import java.util.*;

public class MergeMaps {
	
	public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
        System.out.println("Merged Map: " + mergeMaps(map1, map2));
    }
	
    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> merged = new HashMap<>(map1);
        map2.forEach((k, v) -> merged.put(k, merged.getOrDefault(k, 0) + v));
        return merged;
    }
}
