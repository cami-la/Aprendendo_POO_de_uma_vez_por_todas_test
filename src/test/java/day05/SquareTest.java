package test.java.day05;

import main.java.day05.forms.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
  private Square square;
  @BeforeEach
  void setUp() {
    square = new Square(4d, 4d);
  }

  @Test
  void shouldCalculateSquareArea_ThenReturnResult() {
    //given
    //when
    double actual = square.calculateArea();
    //then
    double expected = 16d;
    Assertions.assertEquals(expected, actual);
  }
}