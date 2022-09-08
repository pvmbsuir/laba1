package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
  @Test
  void divide() {
    Complex a0 = new Complex(-2, 1);
    Complex b0 = new Complex(1, -1);
    Complex r0 = new Complex(-1.5, -0.5);

    Complex a1 = new Complex(-2, 1);
    Complex b1 = new Complex(0, 0);

    assertAll("Should divide complex numbers",
      () -> assertEquals(a0.divide(b0), r0),
      () -> assertThrows(ArithmeticException.class, () -> a1.divide(b1))
    );
  }

  @Test
  void minus() {
    Complex a0 = new Complex(7, 9);
    Complex b0 = new Complex(3, 4);
    Complex r0 = new Complex(4, 5);

    Complex a1 = new Complex(9, 2);
    Complex b1 = new Complex(4, -1);
    Complex r1 = new Complex(5, 3);

    assertAll("Should subtract complex numbers",
      () -> assertEquals(a0.minus(b0), r0),
      () -> assertEquals(a1.minus(b1), r1)
    );
  }
}
