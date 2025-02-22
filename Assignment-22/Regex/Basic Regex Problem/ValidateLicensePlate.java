import java.util.regex.*;
public class ValidateLicensePlate {
    public static void main(String[] args) {
        String plate = "AB1234";
        System.out.println(validateLicensePlate(plate));
    }

    public static boolean validateLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return plate.matches(regex);
    }
}