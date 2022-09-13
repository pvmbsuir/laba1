package tests;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {

    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(120, 100);
        Complex b = new Complex(500,50);
        a.minus(b);
        assertEquals(-380, a.getRe());
        assertEquals(50, a.getIm());
    }

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex(100, 50);
        Complex b = new Complex(100,100);
        a.divide(b);
        assertEquals(0.75, a.getRe());
        assertEquals(-0.25, a.getIm());
    }
}
