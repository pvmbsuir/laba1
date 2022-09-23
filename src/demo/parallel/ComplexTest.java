package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);
        assertNotEquals(new Complex(3, 3), a.plus(b));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Complex b = new Complex(2, 2);
        Complex a = new Complex(1, 1);
        assertNotEquals(new Complex(1, 1), a.plus(b));
    }
}