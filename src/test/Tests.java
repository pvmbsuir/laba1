package test;

import demo.parallel.Complex;
import org.junit.Test;
import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testMinus(){
        Complex a = new Complex(2,2);
        Complex b = new Complex(5,4);
        a.minus(b);
        assertEquals(-3,a.getRe());
        assertEquals(-2,a.getIm());
    }

    @Test
    public void testDivides(){
        Complex a = new Complex(-2,1);
        Complex b = new Complex(1,-1);
        a.divides(b);
        assertEquals(-1.5,a.getRe());
        assertEquals(-0.5,a.getIm());
    }
}
