package UnitTest;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class proverka {

    @Test
    public void ymnTest() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 1);

        a.ymn(b);

        Assert.assertTrue(a.getRe() == 3);
        Assert.assertTrue(a.getIm() == 2);
    }
}
