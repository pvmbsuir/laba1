import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void TestSub(){
        Complex a = new Complex(3, 4);
        Complex b = new Complex(2, 7);
        a.sub(b);
        assertEquals(a.getReal(), 1);
        assertEquals(a.getImaginary(), -3);
    }

    @Test
    public void TestDivide(){
        Complex a = new Complex(12, 6);
        Complex b = new Complex(3, 2);
        a.divide(b);
        assertEquals(a.getReal(), 1);
        assertEquals(a.getImaginary(), 8);
    }
}