package Tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

class CalculationTest {
    Complex a = new Complex(2,4);
    Complex b = new Complex(1,3);

    @Test
    void testPlus()
    {
        Complex c = a.plus(b);
        assert c.getIm()==7 && c.getRe()==3;
    }

    @Test
    void testMinus()
    {
        Complex c = a.minus(b);
        assert c.getIm()==1 && c.getRe()==1;
    }
}
