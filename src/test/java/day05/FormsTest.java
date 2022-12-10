package test.java.day05;

import main.java.day05.forms.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FormsTest {
  private Rectangle rectangle;
  private Square square;
  private Circle circle;
  private Trapeze trapeze;

  @BeforeEach
  void setUp() {
    rectangle = new Rectangle(4d, 6d);
    square = new Square(4d, 4d);
    circle = new Circle(3d);
    trapeze = new Trapeze(12d, 20d, 15d);
  }

  @Test
  void shouldCreateArrayWithAllForms() {
    //given
    //when
    CalculableArea[] forms = {this.rectangle, this.square, this.circle, this.trapeze};
    CalculableArea actual = forms[2];
    //then
    CalculableArea expected = this.circle;
    Assertions.assertEquals(expected, actual);
  }
}
