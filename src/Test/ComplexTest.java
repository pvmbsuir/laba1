package Test;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComplexTest {

    //assertEquals - утверждает, что значения равны

    @Test
    public void testMinus() {
        Complex compNum1 = new Complex(8,5);
        Complex compNum2 = new Complex(4, 4);
        compNum1.minus(compNum2);
        assertEquals(4,compNum1.getRe());
        assertEquals(1,compNum1.getIm());
    }

    @Test
    public void testDivides() {
        Complex compNum1 = new Complex(12,7);
        Complex compNum2 = new Complex(4, 3);
        compNum1.divides(compNum2);
        assertEquals(2.76,compNum1.getRe());
        assertEquals(-0.32,compNum1.getIm());
    }
}
