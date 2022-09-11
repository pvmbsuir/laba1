package demo.parallel.test;

import demo.parallel.Complex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    Complex complexFirst;
    Complex complexSecond;

    @BeforeEach
    void init()
    {
        complexFirst = new Complex(10,10);
        complexSecond = new Complex(20,20);
    }

    @Test
    void minusTest() {
        complexSecond.minus(complexFirst);
        assertEquals(200,complexSecond.lengthSQ());
    }

    @Test
    void dividedTest()
    {
        complexSecond.divides(complexFirst);
        assertEquals(4,complexSecond.lengthSQ());
    }


}
