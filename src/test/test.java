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
        assertEquals(-143506, a.Re());
        assertEquals(146330, a.Im());
    }

    @Test
    public void testPlus() throws Exception{
        Complex a = new Complex(1857, 847);
        Complex b = new Complex(-1746,-473);
        a.plus(b);
        assertEquals(111, a.Re());
        assertEquals(374, a.Im());
    }

    @Test
    public void minusTest() {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 1);

        a.minus(b);

        assertEquals(2, a.Re());
        assertEquals(1, a.Im());

    }
}
