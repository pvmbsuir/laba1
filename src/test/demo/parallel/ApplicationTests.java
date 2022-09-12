package test.demo.parallel;

import org.junit.jupiter.api.Test;
import demo.parallel.Complex;

public class ApplicationTests {

    @Test
    void complexMinusOperationTest() {
        Complex complex = new Complex(10, 2);
        complex = complex.minus(new Complex(5, 1));

        assert complex.getRe() == 5 && complex.getIm() == 1;
    }

    @Test
    void complexPlusOperationTest() {
        Complex complex = new Complex(10, 2);
        complex = complex.plus(new Complex(10 ,2));

        assert complex.getRe() == 20 && complex.getIm() == 4;
    }

    @Test
    void complexTimesOperationTest() {
        Complex complex = new Complex(10, 2);
        complex = complex.times(new Complex(10 ,2));

        assert complex.getRe() == 96 && complex.getIm() == 40;
    }

}
