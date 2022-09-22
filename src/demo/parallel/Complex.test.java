package demo.parallel;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {

    @Rule
    public ExpectedException thrown;

    @Before
    void initException(){
        thrown = ExpectedException.none();
    }
    @org.junit.jupiter.api.Test
    void checkMinus() {
        assertTrue(new Complex(10.3,2.1).minus(new Complex(7.9,-4)).equals(new Complex(2.4,6.1)),
                "Test for simple subtraction.");
    }

    @org.junit.jupiter.api.Test
    void checkGetCos() {
        assertTrue(new Complex(Math.PI /6,0).getCos().equals(new Complex(Math.sqrt(3)/2,0)),
                "Test for calculating cos(z) with arg = PI/6");
        assertTrue(new Complex(2*Math.PI/3 ,0).getCos().equals(new Complex(-0.5,0)),
                "Test for calculating cos(z) with arg =2PI/3");
    }

    @org.junit.jupiter.api.Test
    public void checkDivide() throws Exception {
        Complex a = new Complex(3, 3);
        Complex b = new Complex(2,4);
        a.divide(b);

        assertEquals(0.75, a.getRe());
        assertEquals(2.25, a.getIm());
    }
}