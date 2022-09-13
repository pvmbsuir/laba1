package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.parallel.Complex;

public class test {
    @Test
    public void TestDivide(){
        Complex a = new Complex(8,12);
        Complex b = new Complex(2, 3);
        a = a.divides(b);
        assertEquals(4, a.GetRe(), 3);
        assertEquals(0, a.GetIm(), 3);
    }
    @Test
    public void TestMinus(){
        Complex a = new Complex(77.7,4.4);
        Complex b = new Complex(7, 4);
        a = a.minus(b);
        assertEquals(70.7, a.GetRe(), 3);
        assertEquals(0.4, a.GetIm(), 3);
    }
}
