package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComplexTest {
    Complex a = new Complex(1,1);
    Complex b = new Complex(2,3);

    @Test
    void testDecrement()
    {
        Complex c = a.minus(b);
        assert c.getReal()==-1 && c.getImaginary()==-2;
    }

    @Test
    void testMultiply()
    {
        Complex c = a.times(b);
        assert c.getImaginary()==5 && c.getReal()==-1;
    }

    @Test
    void testFlowey()
    {
        Complex a = new Complex(2,3);
        Complex c = a.flowey(a,2);
        Complex d = a.times(a);
        assert c==d;
    }
}