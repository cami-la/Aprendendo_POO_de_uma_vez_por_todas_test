package test.java.day05;

import main.java.day05.forms.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {
  private Rectangle rectangle;
  @BeforeEach
  void setUp() {
    rectangle = new Rectangle(4d, 6d);
  }

  @Test
  void shouldCalculateRectangleArea_ThenReturnResult() {
    //given
    //when
    double actual = rectangle.calculateArea();
    //then
    double expected = 24d;
    Assertions.assertEquals(expected, actual);
  }
}