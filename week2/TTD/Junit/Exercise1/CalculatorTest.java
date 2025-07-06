package CognizantAssignment.week2.TTD.Junit.Exercise1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(6, c.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2, c.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator c = new Calculator();
        c.divide(5, 0); // Should throw exception
    }
}

