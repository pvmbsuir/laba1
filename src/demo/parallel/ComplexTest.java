package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void div(){
        Complex a = new Complex(4, -2);
        Complex b = new Complex(3, 3);
        Complex expected = new Complex(1.0/3, -1);
        Complex divResult = a.div(b);
        Assert.assertEquals(expected, divResult);
    }

    @Test
    public void sub(){
        Complex a = new Complex(12.0, -7.0);
        Complex b = new Complex(-8.0, 4.0);
        Complex expected = new Complex(20.0, -11.0);
        Complex minusResult = a.sub(b);
        Assert.assertEquals(expected, minusResult);
    }
}