import java.util.Scanner;

public class NaturalNumberSumFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
