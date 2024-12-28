import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorSpec {

    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void testAddTwoNumbersSeparatedByComma() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,5"));
    }

    @Test
    public void testAddThreeNumbersSeparatedByComma() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(28, calculator.add("1,22,5"));
    }
    @Test
    public void testAddMultipleNumbersSeparatedByComma() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(10, calculator.add("1,2,3,4"));

    }

    @Test
    public void testAddWithNewlines() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void testAddWithMultipleNewLines() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(30, calculator.add("1,2\n6\n10,11"));
    }

    @Test
    public void testAddWithCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void testAddWithCustomDelimiter2() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(7, calculator.add("//:\n1:2:4"));
    }

    @Test
    public void testAddNegativeNumbersThrowsException() {
        StringCalculator calculator = new StringCalculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-2,3,-4"));

        assertEquals("Negative numbers not allowed: -2,-4", exception.getMessage());
    }

    @Test
    public void testAddNegativeNumbersThrowsExceptionWithNextLines() {
        StringCalculator calculator = new StringCalculator();

        // When negative numbers are passed
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("1,-3\n6,-4"));

        // Verify the exception message
        assertEquals("Negative numbers not allowed: -3,-4", exception.getMessage());
    }

    @Test
    public void testAddNegativeNumbersThrowsExceptionWithNextLines2() {
        StringCalculator calculator = new StringCalculator();

        // When negative numbers are passed
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("-11,-3\n6,-4"));

        // Verify the exception message
        assertEquals("Negative numbers not allowed: -11,-3,-4", exception.getMessage());
    }



}
