package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    public void testTimes() throws Exception{
        Complex a = new Complex(857, 17);
        Complex b = new Complex(-164,174);
        a.times(b);
        assertEquals(-143506, a.getRe());
        assertEquals(146330, a.getIm());
    }

    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(1857, 847);
        Complex b = new Complex(-1746,-473);
        a.plus(b);
        assertEquals(111, a.getRe());
        assertEquals(374, a.getIm());
    }
}
