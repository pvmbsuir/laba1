package test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void takeMinus() {
        Complex a = new Complex(101, 43);
        Complex b = new Complex(55, 53);

        a.minus(b);
        a.plus(b);

        assertEquals(101, a.getRe());
        assertEquals(43, a.getIm());
    }

    @Test
    void takeMinusNegative() {
        Complex a = new Complex(101, 43);
        Complex b = new Complex(505, 53);

        a.minus(b);
        a.plus(b);

        assertEquals(101, a.getRe());
        assertEquals(43, a.getIm());
    }
}
