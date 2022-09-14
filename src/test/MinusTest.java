package test;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinusTest {
    @Test
    public void testMinus() throws Exception{
        Complex a = new Complex(29, 47);
        Complex b = new Complex(58,28);
        a.minus(b);
        assertEquals(-29, a.getRe());
        assertEquals(19, a.getIm());
    }
}
