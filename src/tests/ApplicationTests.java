package tests;

import org.junit.jupiter.api.Test;

public class ApplicationTests {

    @Test
    void complexMinusOperationTest() {
        Complex complex = new Complex(77, 11);
        complex = complex.minus(new Complex(6, 3));

        assert complex.getRe() == 71 && complex.getIm() == 8;
    }

    @Test
    void complexPlusOperationTest() {
        Complex complex = new Complex(20, 6);
        complex = complex.plus(new Complex(40 ,4));

        assert complex.getRe() == 60 && complex.getIm() == 10;
    }

    @Test
    void complexTimesOperationTest() {
        Complex complex = new Complex(10, 2);
        complex = complex.times(new Complex(10 ,2));

        assert complex.getRe() == 96 && complex.getIm() == 40;
    }
}
