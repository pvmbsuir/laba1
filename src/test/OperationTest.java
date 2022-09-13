package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, -10);
        a.minus(b);
        assertEquals(-2, a.getRe());
        assertEquals(12, a.getIm());
    }

    @Test
    public void div() {
        Complex a = new Complex(2, 5);
        Complex b = new Complex(3, -2);
        a.dividedBy(b);
        assertEquals((-4. / 13), a.getRe());
        assertEquals(19. / 13, a.getIm());
    }
}