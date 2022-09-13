package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComplex {

    @Test
    public void testDivide() throws  Exception{
        Complex a = new Complex(1050, 50);
        Complex b = new Complex(500, 10);

        a.divide(b);

        assertEquals(-2.9, a.getRe());
        assertEquals(105.1, a.getIm());

    }

    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(1178, 28);
        Complex b = new Complex(100,-10);
        a.minus(b);
        assertEquals(1078, a.getRe());
        assertEquals(38, a.getIm());
    }

    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(0, -197);
        Complex b = new Complex(150,100);
        a.plus(b);
        assertEquals(150, a.getRe());
        assertEquals(-97, a.getIm());
    }
}