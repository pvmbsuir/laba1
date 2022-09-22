package test;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void minusTest() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 1);

        a.minus(b);

        Assert.assertEquals(2, a.getRe(), 0.0);
        Assert.assertEquals(1, a.getIm(), 0.0);
    }

    @Test
    public void divTest() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(5, 8);

        a.div(b);

        Assert.assertEquals(0.382, a.getRe(), 0.05);
        Assert.assertEquals(0.134, a.getIm(), 0.05);
    }

    @Test
    public void modulusTest() {
        Complex a = new Complex(3, 4);
        Assert.assertEquals(5.0, a.modulus(), 0.0);
    }
}
