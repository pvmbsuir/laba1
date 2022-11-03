package tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void subTest() {

        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 1);

        a.sub(b);

        Assert.assertTrue(a.getRe() == 2);
        Assert.assertTrue(a.getIm() == 1);
    }

    @Test
    public void plusTest() {

        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 1);

        a.plus(b);

        Assert.assertTrue(a.getRe() == 4);
        Assert.assertTrue(a.getIm() == 3);
    }
}