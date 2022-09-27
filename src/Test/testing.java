package Test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testing {
    @Test
    public void Sub_test() throws Exception {
        Complex a = new Complex(10, 9);
        Complex b = new Complex(2,19);
        a.plus(b);
        assertEquals(12, a.getRe());
        assertEquals(28, a.getIm());
    }

    @Test
    public void Minus_test() throws Exception {
        Complex a = new Complex(12, 9);
        Complex b = new Complex(2, 4);
        a.min(b);
        assertEquals(10, a.getRe());
        assertEquals(5, a.getIm());
    }
}