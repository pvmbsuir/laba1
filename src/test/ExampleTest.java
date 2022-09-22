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
}
