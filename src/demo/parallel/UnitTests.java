package demo.parallel;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class UnitTests {
    @Test
    void minus(){
        Complex a = new Complex(5, 3);
        a = a.minus(new Complex(4, 2));
        Assertions.assertEquals(a.getRe(), 1);
        Assertions.assertEquals(a.getIm(), 1);
    }

    @Test
    void divisionTrue(){
        Complex a = new Complex(4, 8);
        a = a.division(new Complex(8, 6));
        Assertions.assertEquals(a.getRe(), 0.8);
        Assertions.assertEquals(a.getIm(), 0.4);
    }

    @Test
    void divisionFalse(){
        Complex a = new Complex(0, -2);
        a = a.division(new Complex(3, 5));
        Assertions.assertNotEquals(a.getRe(), 100);
        Assertions.assertNotEquals(a.getIm(), 200);
    }
}
