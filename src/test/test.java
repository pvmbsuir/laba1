package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(10, 30);
        Complex b = new Complex(20,40);
        a.plus(b);
        assertEquals(30, a.getRe());
        assertEquals(70, a.getIm());
    }

    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(10, 40);
        Complex b = new Complex(20,30);
        a.minus(b);
        assertEquals(-10, a.getRe());
        assertEquals(10, a.getIm());
    }

    @Test
    public void testDiv() throws Exception{
        Complex a = new Complex(13, 1);
        Complex b = new Complex(7,-6);
        a.div(b);
        assertEquals(1, a.getRe());
        assertEquals(1, a.getIm());
    }
}
