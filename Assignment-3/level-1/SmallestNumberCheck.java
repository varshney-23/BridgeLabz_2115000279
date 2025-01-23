import java.util.Scanner;

public class SmallestNumberCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
    }
}
