package Test;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DemoApplicationTests
{


    @Test
    public void testDivide() throws Exception{
        Complex a = new Complex(15, 8);
        Complex b = new Complex(-4,12);
        a.divide(b);
        assertEquals(0.225, a.getRe());
        assertEquals(-1.325, a.getIm());
    }

    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(4, 13);
        Complex b = new Complex(2,8);
        a.minus(b);
        assertEquals(2, a.getRe());
        assertEquals(5, a.getIm());
    }


}


