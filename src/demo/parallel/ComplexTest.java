package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(1,3);
        Complex b = new Complex(1,2);
        Complex c = new Complex(0,1);
        a = a.minus(b);
        boolean test = c.comp(a);
        assertEquals(true,test);
    }
}