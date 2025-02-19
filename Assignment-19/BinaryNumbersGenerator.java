import java.util.*;

public class BinaryNumbersGenerator {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Binary Numbers: " + generateBinaryNumbers(n));
    }
    
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 0; i < n; i++) {
            String binary = queue.poll();
            result.add(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
        }
        return result;
    }
}
