package test;

import demo.parallel.Complex;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testMinus(){
        Complex a = new Complex(5,7);
        Complex b = new Complex(4,8);
        a.minus(b);
        assertEquals(1,a.getRe());
        assertEquals(-1,a.getIm());
    }

    @Test
    public void testDivides(){
        Complex a = new Complex(-1,3);
        Complex b = new Complex(1,2);
        a.div(b);
        assertEquals(1,a.getRe());
        assertEquals(1,a.getIm());
    }
}