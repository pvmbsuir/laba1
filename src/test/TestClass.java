package test;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
public class TestClass {


    Complex a = new Complex(3,5);
    Complex b = new Complex(2,4);

    @Test
    void testIncrement()
    {
        Complex c = a.plus(b);
        assert c.getIm()==9 && c.getRe()==5;
    }

    @Test
    void testDecrement()
    {
        Complex c = a.minus(b);
        assert c.getIm()==1 && c.getRe()==1;
    }

    @Test
    void testMultiply()
    {
        Complex c = a.times(b);
        assert c.getIm()==22 && c.getRe()==-14;
    }

    @Test
    void testDiversity()
    {
        Complex a = new Complex(2,3);
        Complex b = new Complex(1,1);
        Complex c = a.dividedBy(b);
        assert c.getIm()==0.5 && c.getRe()==2.5;
    }
}
