package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testComplexSub() throws Exception{
        Complex a = new Complex(9, 3);
        Complex b = new Complex(2,2);
        a.sub(b);
        assertEquals(7, a.getRe());
        assertEquals(1, a.getIm());
    }

    @Test
    public void testComplexDivide() throws Exception{
        Complex a = new Complex(9, 3);
        Complex b = new Complex(2,2);
        a.division(b);
        assertEquals(3, a.getRe());
        assertEquals(-1.5, a.getIm());
    }

    @Test
    public void testComplexPow() throws Exception{
        Complex a = new Complex(9,3);
        Complex b = new Complex(9,3);
        a.pow(2);
        b.times(b);
        assertEquals(b.getRe(), a.getRe());
        assertEquals(b.getIm(), a.getIm());
    }
}
