package testing;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;


public class SampleTest {
    @Test
    public void minusTest() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 1);

        a.minus(b);

        Assert.assertTrue(a.getRe() == 2);
        Assert.assertTrue(a.getIm() == 1);
    }
}
