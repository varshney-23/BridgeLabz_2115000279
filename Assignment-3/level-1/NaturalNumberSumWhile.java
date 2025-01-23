import java.util.Scanner;

public class NaturalNumberSumWhileAyushi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumWhile = 0, i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);
        } else {
            System.out.println("The number is not a natural number");
        }
    }
}
