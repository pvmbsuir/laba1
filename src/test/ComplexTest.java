package test;


import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ComplexTest {
    @Test
    void substraction(){
        Complex test = new Complex(15, 15);
        test = test.substraction(new Complex(10, 5));
        Assertions.assertTrue(test.getRe() == 5 && test.getIm() == 10);
    }

    @Test
    void division(){
        Complex test = new Complex(4, 8);
        test = test.division(new Complex(8, 6));
        Assertions.assertTrue(test.getRe() == 0.8 && test.getIm() == 0.4);
    }
}
