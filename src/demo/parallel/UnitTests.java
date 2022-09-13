package demo.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UnitTests {

    @Test
    void divisionTrue(){
        Complex a = new Complex(4, 8);
        a = a.divide(new Complex(8, 6));
        Assertions.assertEquals(a.getRe(), 0.8);
        Assertions.assertEquals(a.getIm(), 0.4);
    }

    @Test
    void divisionFalse(){
        Complex a = new Complex(0, -2);
        a = a.divide(new Complex(3, 5));
        Assertions.assertNotEquals(a.getRe(), 100);
        Assertions.assertNotEquals(a.getIm(), 200);
    }


}
