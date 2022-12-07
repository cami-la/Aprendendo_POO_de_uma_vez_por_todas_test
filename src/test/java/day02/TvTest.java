package test.java.day02;

import main.java.day02.Tv;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TvTest {
  private Tv tv;

  @BeforeEach
  void setUp() {
    this.tv = new Tv(10);
  }

  @Test
  void shouldTurnUpVolume() {
    //given
    //when
    this.tv.turnUpVolume();
    this.tv.turnUpVolume();
    this.tv.turnUpVolume();
    int actual = this.tv.getVolume();
    //then
    int expected = 8;
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldTurnDownVolume() {
    //given
    //when
    this.tv.turnDownVolume();
    this.tv.turnDownVolume();
    this.tv.turnDownVolume();
    int actual = this.tv.getVolume();
    //then
    int expected = 2;
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldThrowRuntimeException_WhenTryTurnUpVolumeUpZero() {
    //given
    this.tv.setVolume(10);
    //when
    RuntimeException actual = Assertions.assertThrows(RuntimeException.class, () -> {
      this.tv.turnUpVolume();
    });
    int actualVolume = this.tv.getVolume();
    //then
    String expected = "It's already at full volume";
    Assertions.assertEquals(actual.getMessage(), expected);

    int exectedVolume = 10;
    Assertions.assertEquals(exectedVolume, actualVolume);
  }

  @Test
  void shouldThrowRuntimeException_WhenTryTurnDownVolumeBelowZero() {
    //given
    this.tv.setVolume(0);
    //when
    RuntimeException actual = assertThrows(RuntimeException.class, () -> {
      this.tv.turnDownVolume();
    });
    int actualVolume = this.tv.getVolume();
    //then
    String expected = "It's already at minimum volume";
    Assertions.assertEquals(actual.getMessage(), expected);

    int exectedVolume = 0;
    Assertions.assertEquals(exectedVolume, actualVolume);
  }
}