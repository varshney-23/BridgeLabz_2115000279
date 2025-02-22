import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {
        String username = "user_123";
        System.out.println(validateUsername(username));
    }

    public static boolean validateUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }
}