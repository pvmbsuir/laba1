package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testDiv(){

        Complex a = new Complex(4, -2);
        Complex b = new Complex(4, -2);
        Complex expected = new Complex(1, 0);
        Complex divResult = a.div(b);
        Assert.assertEquals(expected, divResult);
    }

    @Test
    public void testMinus(){

        Complex a = new Complex(3, -1);
        Complex b = new Complex(1, -2);
        Complex expected = new Complex(2, 1);
        Complex minusResult = a.minus(b);
        Assert.assertEquals(expected, minusResult);
    }

}
