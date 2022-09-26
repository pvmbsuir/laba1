package demo.tests;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {
    @Test
    public void SubtractionCheck(){
        Complex a = new Complex(25,0.25);
        Complex b = new Complex(0.25, 25);
        a = a.minus(b);
        assertEquals(24.75, a.real());
        assertEquals(-24.75, a.imaginary());
    }
    @Test
    public void DivisionTest(){
        Complex a = new Complex(1,2);
        Complex b = new Complex(2, 1);
        a = a.divide(b);
        assertEquals(0.8, a.real());
        assertEquals(0.6, a.imaginary());
    }
}
