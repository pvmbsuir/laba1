package Tests;

import demo.parallel.Complex;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testSub() {
        Complex a = new Complex(5,1);
        Complex b = new Complex(4,7);
        Complex aAfterSubtraction = new Complex(a.real()-b.real(),a.im()-b.im());
        a.sub(b);
        assertEquals(aAfterSubtraction.real(), a.real(), "Real parts aren't equal");
        assertEquals(aAfterSubtraction.im(), a.im(),"Imaginary parts aren't equal");
    }
}
