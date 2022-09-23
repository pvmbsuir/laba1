package demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void PlusTest() {
        Complex complex = new Complex(12, 4);
        complex = complex.plus(new Complex(7, 5));

        assert complex.getReal() == 19 && complex.getImaginary() == 9;
    }

    @Test
    void DivideTest() {
        Complex complex = new Complex(12, 2);
        complex = complex.divide(new Complex(2, 2));

        assert complex.getReal() == 3.5f && complex.getImaginary() == -2.5f;
    }

    @Test
    void DivideByZeroTest(){
        Complex complex = new Complex(12, 2);
        complex = complex.divide(new Complex(0, 2));

        assert !Double.isNaN(complex.getReal());
        assert !Double.isNaN(complex.getImaginary());
    }
}
