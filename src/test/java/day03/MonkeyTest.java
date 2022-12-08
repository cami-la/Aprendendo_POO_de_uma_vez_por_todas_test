package test.java.day03;

import main.java.day03.Monkey;
import main.java.day03.enums.Fruit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MonkeyTest {
  private Monkey monkey;

  @BeforeEach
  void setUp() {
    monkey = new Monkey();
  }

  @ParameterizedTest
  @EnumSource(Fruit.class)
  void shouldAddTheFoodOnStomach_WhenFoodIsStringOrMonkey(Fruit fruit) {
    //given
    Monkey food = new Monkey();
    //when
    this.monkey.toEat(fruit);
    this.monkey.toEat(food);
    Monkey actualFood2 = (Monkey) this.monkey.getStomach().get(1);
    int actualSize = this.monkey.getStomach().size();
    //then
    int expectedSize = 2;
    Assertions.assertEquals(food, actualFood2);
    Assertions.assertEquals(expectedSize, actualSize);
  }

  @Test
  void shouldThrowIllegalArgumentException_WhenFoodIsNotFruitOrMonkey() {
    //given
    int food = 10;
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      this.monkey.toEat(food);
    });
    //then
    String expected = "The Monkey doesn't eat this type of food!";
    Assertions.assertEquals(expected, actual.getMessage());
  }

  @Test
  void shouldRemoveTheFoodOnStomach_WhenStomochDoesntEmpty() {
    //given
    monkey.toEat(Fruit.APPLE);
    //when
    this.monkey.toDigest();
    boolean actual = this.monkey.getStomach().isEmpty();
    //then
    boolean expected = true;
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldThrowRuntimeException_WhenStomochtEmpty() {
    //given
    //when
    RuntimeException actual = assertThrows(RuntimeException.class, () -> {
      this.monkey.toDigest();
    });
    //then
    String expected = "Stomach already empty!";
    Assertions.assertEquals(expected, actual.getMessage());
  }
}