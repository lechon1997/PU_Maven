package co.com.sofka.app.calculator;

import co.com.sofka.app.BasicCalculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing suma: 1+1=2")
    public void suma() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing resta: 4-1=3")
    public void resta() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 1L;
        Long expectedValue = 3L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplicacion: 3*2=6")
    public void multiplicacion() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 2L;
        Long expectedValue = 6L;

        // Act
        Long result = basicCalculator.multiplicacion(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing division: 3/3=1")
    public void division() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 3L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}
