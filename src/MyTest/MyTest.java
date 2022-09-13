package MyTest;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test

    public void testMinus() throws Exception {
        Complex a = new Complex(7777, 34);
        Complex b = new Complex(10, -10);
        ;
        a.minus(b);
        a.plus(b);
        assertEquals(7777, a.getRe());
        assertEquals(34, a.getIm());
    }
}