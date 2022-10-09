package demo.parallel;

import org.junit.jupiter.api.Test;

public class Tests {
        @Test
        void complexPlusOperationTest() {
            Complex complex = new Complex(12, 2);
            complex = complex.plus(new Complex(10, 1));

            assert complex.getRealData() == 22 && complex.getImaginaryData() == 3;
        }

        @Test
        void squareComplexTest() {
            Complex complex = new Complex(12, 2);

            assert complex.lengthSQ() == 12*12 + 2*2;
        }

    }
