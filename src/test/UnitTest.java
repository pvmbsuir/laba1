package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class UnitTest {

    @Test
    public void testPlus() throws Exception {
        Complex a = new Complex(6, 6);
        Complex b = new Complex(4,8);
        a.plus(b);
        assertEquals(10, a.getRe());
        assertEquals(14, a.getIm());
    }

    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(3, 8);
        Complex b = new Complex(1,15);
        a.minus(b);
        assertEquals(2, a.getRe());
        assertEquals(-7, a.getIm());
    }
}
