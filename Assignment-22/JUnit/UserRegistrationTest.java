import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john@example.com", "password123"));
    }

    @Test
    void testInvalidRegistration() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "john@example.com", "123"));
    }
}