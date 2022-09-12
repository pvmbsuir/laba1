package demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void complexPlusOperationTest() {
        Complex complex = new Complex(12, 2);
        complex = complex.plus(new Complex(10, 1));

        assert complex.getReal() == 22 && complex.getImaginary() == 3;
    }

    @Test
    void complexDivideOperationTest() {
        Complex complex = new Complex(12, 2);
        complex = complex.dividedBy(new Complex(2, 2));

        assert complex.getReal() == 3.5f && complex.getImaginary() == -2.5f;
    }

    @Test
    void squareComplexTest() {
        Complex complex = new Complex(12, 2);

        assert complex.lengthSQ() == 12*12 + 2*2;
    }

}
