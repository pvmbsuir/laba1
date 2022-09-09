package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class ApplicationTests {

    @Test
    void complexPlusOperationTest() {
        Complex complex = new Complex(12, 2);
        complex = complex.plus(new Complex(10, 1));

        assert complex.getRe() == 22 && complex.getIm() == 3;
    }

    @Test
    void complexDivideOperationTest() {
        Complex complex = new Complex(12, 2);
        complex = complex.dividedBy(new Complex(2, 2));

        assert complex.getRe() == 3.5f && complex.getIm() == -2.5f;
    }

    @Test
    void squareComplexTest() {
        Complex complex = new Complex(12, 2);

        assert complex.lengthSQ() == 12*12 + 2*2;
    }

}
