package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    void testMinus() {
        var a = new Complex(1.1, 4.4);
        var b = new Complex(3.3, 2.2);
        var result = new Complex(-2.2, 2.2);
        assertEquals(result, a.minus(b));
    }

    @Test
    void testDivide() {
        var a = new Complex(1.1, -2.2);
        var b = new Complex(-3.3, 4.4);
        var result = new Complex(-0.44, 0.08);
        assertEquals(result, a.divide(b));
    }
}
