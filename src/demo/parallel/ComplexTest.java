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


}
