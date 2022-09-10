package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void testCoplexReal() {
        Complex a = new Complex(5,10);
        assertEquals(a.real(), 5);
    }

    @org.junit.jupiter.api.Test
    void testCoplexIm() {
        Complex a = new Complex(5,10);
        assertEquals(a.im(), 10);
    }

    @org.junit.jupiter.api.Test
    void testCoplexPlus() {
        Complex a = new Complex(5,10);
        Complex b = new Complex(4,0);
        Complex aAfterAdding = new Complex(a.real()+b.real(),a.im()+b.im());
        a.plus(b);
        assertEquals(aAfterAdding.real(), a.real(), "Real parts aren't equal");
        assertEquals(aAfterAdding.im(), a.im(),"Imaginary parts aren't equal");

    }

    @org.junit.jupiter.api.Test
    void testCoplexSub() {
        Complex a = new Complex(5,1);
        Complex b = new Complex(4,7);
        Complex aAfterSubtraction = new Complex(a.real()-b.real(),a.im()-b.im());
        a.sub(b);
        assertEquals(aAfterSubtraction.real(), a.real(), "Real parts aren't equal");
        assertEquals(aAfterSubtraction.im(), a.im(),"Imaginary parts aren't equal");
    }

    @org.junit.jupiter.api.Test
    void testCoplexConj() {
        Complex a = new Complex(5,1);
        Complex aAfterConjugation = new Complex(a.real(),-a.im());
        a.conj();
        assertEquals(aAfterConjugation.real(), a.real(), "Real parts aren't equal");
        assertEquals(aAfterConjugation.im(), a.im(),"Imaginary parts aren't equal");
    }

    @org.junit.jupiter.api.Test
    void testCoplexMulComlex() {
        Complex a = new Complex(5,1);
        Complex b = new Complex(4,7);
        Complex aAfterMultiply = new Complex(
                a.real() * b.real() - a.im() * b.im(),
                a.real() * b.im() + a.im() * b.real()
        );
        a.mul(b);
        assertEquals(aAfterMultiply.real(), a.real(), "Real parts aren't equal");
        assertEquals(aAfterMultiply.im(), a.im(),"Imaginary parts aren't equal");
    }

    @org.junit.jupiter.api.Test
    void testCoplexMulDoble() {
        Complex a = new Complex(5,1);
        double b = 5.5;
        Complex aAfterMultiply = new Complex(a.real()*5.5, a.im()*5.5);
        a.mul(b);
        assertEquals(aAfterMultiply.real(), a.real(), "Real parts aren't equal");
        assertEquals(aAfterMultiply.im(), a.im(),"Imaginary parts aren't equal");
    }

    @org.junit.jupiter.api.Test
    void testCoplexlengthSQ() {
        Complex a = new Complex(5,-3);
        assertEquals(a.lengthSQ(), a.real()*a.real()+a.im()*a.im());
    }
}