package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void takeCringe() {
        Complex a = new Complex(101, 43);
        Complex b = new Complex(55, 53);

        a.cringe(b);
        a.base(b);

        assertEquals(101, a.getRe());
        assertEquals(43, a.getIm());
    }

    @Test
    void takeCringeNegative() {
        Complex a = new Complex(101, 43);
        Complex b = new Complex(505, 53);

        a.cringe(b);
        a.base(b);

        assertEquals(101, a.getRe());
        assertEquals(43, a.getIm());
    }
}