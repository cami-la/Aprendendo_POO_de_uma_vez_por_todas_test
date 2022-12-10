package test.java.day05;

import main.java.day05.forms.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

class CircleTest {
  //attributes
  private Circle circle;

  @BeforeEach
  void setUp() {
    circle = new Circle(3d);
  }

  @Test
  void shouldCalculateCircleArea_ThenReturnResult() {
    //given
    DecimalFormat df = new DecimalFormat("#.00");
    //when
    double actual = circle.calculateArea();
    String actualFormat = df.format(actual);
    //then
    double expected = 28.27;
    String expectedFormat = df.format(expected);
    Assertions.assertEquals(expectedFormat, actualFormat);
  }
}