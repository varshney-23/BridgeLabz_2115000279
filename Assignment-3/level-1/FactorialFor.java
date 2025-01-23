import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers");
        }
    }
}
