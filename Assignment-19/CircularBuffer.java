import java.util.*;

public class CircularBuffer {
    int[] buffer;
    int size, start, count;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        start = count = 0;
    }

    public void insert(int value) {
        buffer[(start + count) % size] = value;
        if (count == size) {
            start = (start + 1) % size;
        } else {
            count++;
        }
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(start + i) % size]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(14);
        cb.insert(26);
        cb.insert(32);
        cb.insert(40);
        System.out.println("Buffer: " + cb.getBuffer());
    }
}
