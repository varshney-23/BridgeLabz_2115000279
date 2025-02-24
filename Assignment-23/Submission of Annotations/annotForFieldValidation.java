import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username too long!");
        }
        this.username = username;
    }
}

public class annotForFieldValidation {
    public static void main(String[] args) {
        new User("ShortName");
        new User("ThisIsTooLong");
    }
}
