import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {
    DatabaseConnection connection;

    @BeforeEach
    void setUp() {
        connection = new DatabaseConnection();
        assertTrue(connection.connect());
    }

    @AfterEach
    void tearDown() {
        assertTrue(connection.disconnect());
    }

    @Test
    void testDatabaseConnection() {
        assertTrue(true);
    }
}