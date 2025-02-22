import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
    }
}
