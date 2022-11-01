package demo.parallel;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex(29, 7);
        Complex b = new Complex(2, 1);
        a.divide(b);
        assertEquals(13, a.getRe());
        assertEquals(-3, a.getIm());
    }

    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(7, 11);
        Complex b = new Complex(9, 13);
        a.minus(b);
        assertEquals(-2, a.getRe());
        assertEquals(-2, a.getIm());
    }


}