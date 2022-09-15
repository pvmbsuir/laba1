package Tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(125, 140);
        Complex b = new Complex(500,50);
        a.minus(b);
        assertEquals(-375, a.getRe());
        assertEquals(90, a.getIm());
    }

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex(500, 50);
        Complex b = new Complex(300,400);
        a.divide(b);
        assertEquals(0.68, a.getRe());
        assertEquals(-0.74, a.getIm());
    }
}
