package demo.parallel.Test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {
    @Test
    public void minus() {
        Complex a = new Complex(344, 229);
        Complex b = new Complex(321, 451);
        a.minus(b);
        assertEquals(23, a.getRe());
        assertEquals(-222, a.getIm());
    }

    @Test
    public void plus() {
        Complex a = new Complex(344, 229);
        Complex b = new Complex(321, 451);
        a.plus(b);
        assertEquals(665, a.getRe());
        assertEquals(680, a.getIm());
    }

    @Test
    public void divide() {
        Complex a = new Complex(22, 22);
        Complex b = new Complex(11, 11);
        a.divide(b);
        assertEquals(2, a.getRe());
        assertEquals(2, a.getIm());
    }

    @Test
    public void multiply() {
        Complex a = new Complex(2, 2);
        Complex b = new Complex(4, 4);
        a.multiply(b);
        assertEquals(8, a.getRe());
        assertEquals(8, a.getIm());
    }
}
