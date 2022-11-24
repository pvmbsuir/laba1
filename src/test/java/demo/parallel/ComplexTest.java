package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testDivShouldReturnTheRightCalculation(){
        //given
        Complex a = new Complex(4, -2);
        Complex b = new Complex(3, 3);
        Complex expected = new Complex(1.0/3, -1);
        //when
        Complex divResult = a.div(b);
        //then
        Assert.assertEquals(expected, divResult);
    }

    @Test
    public void testMinusShouldReturnTheRightCalculation(){
        //given
        Complex a = new Complex(4, -2);
        Complex b = new Complex(3, 3);
        Complex expected = new Complex(1, -5);
        //when
        Complex minusResult = a.minus(b);
        //then
        Assert.assertEquals(expected, minusResult);
    }

}
