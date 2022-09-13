package demo.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void testMinusBasic() throws Exception {
        String errorMessage = "Basic minus operation";
        Complex a = new Complex(2, 4);
        Complex b = new Complex(6, 2);
        a.minus(b);
        //assertTrue(a.equals(new Complex(-4, 2)), errorMessage);
        assertTrue(a.equals(new Complex(-4, 2)));
    }

    @Test
    public void testMinusNegative() throws Exception {
        String errorMessage = "Minus negative complex number";
        Complex a = new Complex(10235, -10288);
        Complex b = new Complex(-16, 2);
        a.minus(b);
        assertTrue(a.equals(new Complex(10251, -10290)), errorMessage);
    }

    @Test
    public void testDivideBasic() throws Exception {
        final double startedReal = 1.3;
        final double startedImagine = 2.7;
        Complex c1 = new Complex(startedReal, startedImagine);

        //assertEquals("Object must return itself", c1, c1.divide(new Complex(2, 0)));
        c1 = new Complex(startedReal, startedImagine);
        assertTrue(c1.clone().divide(new Complex(2, 0))
                .equals(new Complex(startedReal / 2, startedImagine / 2)));
        assertTrue(c1.clone().divide(new Complex(1, 0))
                .equals(c1));
        assertTrue(c1.clone().divide(new Complex(0, -1))
                .equals(new Complex(- startedImagine, startedReal)));
    }

}