package javaTests;
import demo.parallel.Complex;
import junit.framework.TestCase;
import org.junit.Test;


public class ComplexTest extends TestCase {
    Complex firstComplexNum = new Complex(4, 5);
    Complex secondComplexNum = new Complex(7, 8);

    @Test
    public void testPlus() {

        Complex actual = firstComplexNum.plus(secondComplexNum);
        Complex expected = new Complex(11, 13);

        assertEquals(expected.getRe(), actual.getRe());
        assertEquals(expected.getIm(), actual.getIm());
    }

    @Test
    public void testMinus() {

        Complex actual = firstComplexNum.minus(secondComplexNum);
        Complex expected = new Complex(-3, -3);

        assertEquals(expected.getRe(), actual.getRe());
        assertEquals(expected.getIm(), actual.getIm());
    }

    @Test
    public void testDivide() {
        Complex a0 = new Complex(-2, 1);
        Complex b0 = new Complex(1, -1);
        a0.divide(b0);
        assertEquals(a0.getRe(), -1.5);
        assertEquals(a0.getIm(), -0.5);
    }
}