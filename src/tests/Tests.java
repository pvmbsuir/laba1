package tests;


import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {
    @Test
    public void testComplexMinus() throws Exception{
        Complex a = new Complex(8, 1);
        Complex b = new Complex(9,-5);
        a.minus(b);
        assertEquals(-1, a.getRe());
        assertEquals(6, a.getIm());
    }

    @Test
    public void testComplexDiv() throws Exception{
        Complex a = new Complex(23, 1);
        Complex b = new Complex(2,1);
        a.div(b);
        assertEquals(9.4, a.getRe());
        assertEquals(-4.2, a.getIm());
    }
}
