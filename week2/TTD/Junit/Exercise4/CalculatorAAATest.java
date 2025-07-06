package CognizantAssignment.week2.TTD.Junit.Exercise4;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        System.out.println("Test completed");
    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int a = 4;
        int b = 5;
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
}

