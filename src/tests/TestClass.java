package tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class TestClass {
    @Test
    public void testMinus() throws Exception {
        Complex a = new Complex(125, 140);
        Complex b = new Complex(500,50);
        a.minus(b);
        Assertions.assertEquals(-375.0, a.getRe());
        Assertions.assertEquals(90, (int)a.getIm());
    }

    @Test
    public void testDivide() throws Exception {
        Complex a = new Complex(500, 50);
        Complex b = new Complex(300,400);
        a.div(b);
        Assertions.assertEquals(0.68,a.getRe());
        Assertions.assertEquals(-0.74, a.getIm());
    }
}
