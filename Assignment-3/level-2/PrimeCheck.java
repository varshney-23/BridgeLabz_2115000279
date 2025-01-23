import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }
        } else {
            System.out.println("Number must be greater than 1");
        }
    }
}
