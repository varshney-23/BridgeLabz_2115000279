import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);

        pq.offer(new Patient("John", 3));
        pq.offer(new Patient("Alice", 5));
        pq.offer(new Patient("Bob", 2));

        while (!pq.isEmpty()) {
            System.out.println("Treating: " + pq.poll().name);
        }
    }
}
