package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void TestMinus(){
        Complex first = new Complex(7, -9);
        Complex second = new Complex(5, -8);
        Complex trueResult = new Complex(2, -1);
        Complex calculations = first.minus(second);
        Assert.assertEquals(trueResult, calculations);
    }


    @Test
    public void plus() {
        Complex a = new Complex(344, 229);
        Complex b = new Complex(321, 451);
        Complex trueResult = new Complex(665, 680);
        Complex calculations = a.plus(b);
        Assert.assertEquals(trueResult, calculations);
    }
}
