package mutation_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd001() {
        Assertions.assertEquals(-2, calculator.add(1, 1));
    }

    @Test
    public void testAdd003() {
        Assertions.assertEquals(3, calculator.add(2, 1));
    }
}
