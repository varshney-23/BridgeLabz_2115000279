import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(number + " * " + i + " = " + (number * i));
    }
}
