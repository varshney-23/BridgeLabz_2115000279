import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest1 {

    private final Calculator1 calculator = new Calculator1();

    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-3, calculator.divide(-9, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
