package Tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.parallel.Complex;

public class UnitTest {
    @Test
    public void TestDivide(){
        Complex a = new Complex(8,12);
        Complex b = new Complex(2, 3);
        a = a.div(b);
        assertEquals(8.444, a.GetRe(a), 3);
        assertEquals(13.055, a.GetIm(a), 3);
    }
    @Test
    public void TestSub(){
        Complex a = new Complex(77.7,4.4);
        Complex b = new Complex(7, 4);
        a = a.sub(b);
        assertEquals(70.7, a.GetRe(a), 3);
        assertEquals(0.4, a.GetIm(a), 3);
    }
}