package test.java.day05;

import main.java.day05.forms.Trapeze;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrapezeTest {
  //attributes
  private Trapeze trapeze;

  @BeforeEach
  void setUp() {
    trapeze = new Trapeze(12, 20, 15);
  }

  @Test
  void shouldCalculateTrapezeArea_ThenReturnResult() {
    //given
    //when
    double actual = trapeze.calculateArea();
    //then
    double expected = 240d;
    Assertions.assertEquals(expected, actual);
  }
}