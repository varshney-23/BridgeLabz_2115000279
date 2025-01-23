import java.util.*;
public class BMICalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double whgt = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double hght = sc.nextDouble();
        double hghtmet = heightCm / 100;
        double BMI = (whgt / (hghtmet * hghtmet));
        if(BMI <= 18.4){
            System.out.print("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.print("Normal");
        } else if (BMI >= 25.0 && BMI <= 39.9){
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
    }
}
