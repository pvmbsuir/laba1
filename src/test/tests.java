package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {
    @Test
    public void testComplexSub() throws Exception{
        Complex a = new Complex(9, 3);
        Complex b = new Complex(2,2);
        a.sub(b);
        assertEquals(7, a.getRe());
        assertEquals(1, a.getIm());
    }

    @Test
    public void testComplexDivide() throws Exception{
        Complex a = new Complex(9, 3);
        Complex b = new Complex(2,2);
        a.divide(b);
        assertEquals(3, a.getRe());
        assertEquals(-1.5, a.getIm());
    }
}
