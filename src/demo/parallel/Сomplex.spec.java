package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexTest {
  @Test
  void divide() {
    Complex a0 = new Complex(-2, 1);
    Complex b0 = new Complex(1, -1);

    a0.divide(b0);

    assertEquals(a0.getRe(), -1.5);
    assertEquals(a0.getIm(), -0.5);
  }

  @Test
  void minus() {
    Complex a0 = new Complex(7, 9);
    Complex b0 = new Complex(3, 4);

    a0.minus(b0);

    assertEquals(a0.getRe(), 4);
    assertEquals(a0.getIm(), 5);
  }
}
