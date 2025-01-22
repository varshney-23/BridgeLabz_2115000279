import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1 of the triangle in meters: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 of the triangle in meters: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 of the triangle in meters: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000;

        int rounds = (int) Math.ceil(distanceToRun / perimeter);
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
