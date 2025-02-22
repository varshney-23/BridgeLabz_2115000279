import java.util.regex.*;

public class ValidateHexColor {
    public static void main(String[] args) {
        String hex = "#FFA500";
        System.out.println(validateHexColor(hex));
    }

    public static boolean validateHexColor(String hex) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return hex.matches(regex);
    }
}