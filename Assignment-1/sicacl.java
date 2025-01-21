import java.util.Scanner;

public class sicacl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        System.out.println((principal * rate * time) / 100);
        scanner.close();
    }
}
