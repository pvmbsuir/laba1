package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.parallel.Complex;

public class UnitTest {
    @Test
    public void TestDivision() {
        Complex a = new Complex(8, 12);
        Complex b = new Complex(2, 3);

        a = a.division(b);
        assertEquals(8.444, a.getRe(), 3);
        assertEquals(13.055, a.getIm(), 3);
    }

    @Test
    public void TestMinus() {
        Complex a = new Complex(12.3, 1.1);
        Complex b = new Complex(10.3, 0.1);
        a = a.minus(b);
        assertEquals(2.0, a.getRe(), 3);
        assertEquals(1.0, a.getIm(), 3);
    }

    @Test
    public void TestPlus() {
        Complex a = new Complex(12.3, 1.1);
        Complex b = new Complex(10.3, 0.1);
        a = a.plus(b);
        assertEquals(22.3, a.getRe(), 3);
        assertEquals(1.2, a.getIm(), 3);
    }

    @Test
    public void TestTimes() {
        Complex a = new Complex(12.3, 1.1);
        Complex b = new Complex(10.3, 0.1);
        a = a.times(b);
        assertEquals(126.58, a.getRe(), 3);
        assertEquals(12.56, a.getIm(), 3);
    }
}
