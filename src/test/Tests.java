package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void Sub_test() throws Exception {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(4,2);
        a.plus(b);
        assertEquals(9, a.getRe());
        assertEquals(5, a.getIm());
    }

    @Test
    public void Minus_test() throws Exception {
        Complex a = new Complex(3, 3);
        Complex b = new Complex(3, 4);
        a.minus(b);
        assertEquals(0, a.getRe());
        assertEquals(-1, a.getIm());
    }
}
