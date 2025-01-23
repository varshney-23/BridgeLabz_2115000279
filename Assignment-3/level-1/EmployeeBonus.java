import java.util.*;
public class EmployeeBonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary:");
        double sal = sc.nextDouble();
        System.out.print("Enter years of service:");
        double ser = sc.nextDouble();
        if(ser > 5){
                double incre = sal + (5 * sal) / 100;
                System.out.println("Your Bonus Amount is: "+incre);
        } else {
                System.out.println("Sorry, No bonus for you");
        }
    }
}





