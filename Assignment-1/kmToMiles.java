import java.util.Scanner;

public class kmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers = scanner.nextDouble();
        System.out.println(kilometers * 0.621371);
        scanner.close();
    }
}
