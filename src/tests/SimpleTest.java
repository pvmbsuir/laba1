package tests;

import demo.parallel.Complex;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class SimpleTest {
    @Test
    public void minusTest() {
        Complex result = new Complex(0, 0);
        Complex a = new Complex(3, 3);
        Complex b = new Complex(3, 3);
        result = a.minus(b);
        assertEquals(0, result.im);
        assertEquals(0, result.re);
    }

    @Test
    public void plusTest() {
        Complex result = new Complex(0, 0);
        Complex a = new Complex(2, 2);
        Complex b = new Complex(3, 3);
        result = a.plus(b);
        assertEquals(5, result.im);
        assertEquals(5, result.re);
    }

    @Test
    public void timesTest() {
        Complex result = new Complex(0, 0);
        Complex a = new Complex(2, 2);
        Complex b = new Complex(3, 3);
        result = a.times(b);
        assertEquals(12, result.im);
        assertEquals(0, result.re);
    }

}
