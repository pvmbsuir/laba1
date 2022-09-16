package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CompTest {
    @Test
    public void times() throws Exception{
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1,2);
        a.times(b);
        Assert.assertTrue( a.getRe() == -4);
        Assert.assertTrue( a.getIm() == 7);
    }
    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(1, 28);
        Complex b = new Complex(1,-10);
        a.minus(b);
        Assert.assertTrue(a.getRe() == 0);
        Assert.assertTrue(a.getIm() == 38 );
    }

    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(0, 3);
        Complex b = new Complex(1,2);
        a.plus(b);
        Assert.assertTrue( a.getRe() == 1);
        Assert.assertTrue( a.getIm() == 5);
    }


}