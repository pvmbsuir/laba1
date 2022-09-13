package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyTests {

    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(1, 13);
        Complex b = new Complex(2,9);
        a.minus(b);
        assertEquals(-1, a.getRe());
        assertEquals(4, a.getIm());
    }

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex(6, 6);
        Complex b = new Complex(4,8);
        a.divide(b);
        assertEquals(0.75, a.getRe());
        assertEquals(2.25, a.getIm());
    }

}
