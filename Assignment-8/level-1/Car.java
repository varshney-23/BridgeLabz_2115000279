import java.util.Scanner;
class Car{
   String customerName;
   String carModel;
   int rentalDays;
   double costPerDay;
   Car(String customerName, String carModel, int rentalDays, double costPerDay) {
       this.customerName = customerName;
       this.carModel = carModel;
       this.rentalDays = rentalDays;
       this.costPerDay = costPerDay;
   }

   double calculateTotalCost() {
       return rentalDays * costPerDay;
   }
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter Customer Name: ");
       String customerName = sc.nextLine();
       System.out.print("Enter Car Model: ");
       String carModel = sc.nextLine();
       System.out.print("Enter Rental Days: ");
       int rentalDays = sc.nextInt();
       System.out.print("Enter Cost per Day: ");
       double costPerDay = sc.nextDouble();
       Car rental = new Car(customerName, carModel, rentalDays, costPerDay);
       System.out.println("Total Rental Cost: " + rental.calculateTotalCost());
       sc.close();
   }
}