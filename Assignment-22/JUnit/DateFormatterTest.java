import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("15-02-2025", formatter.formatDate("2025-02-15"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("15/02/2025"));
    }
}