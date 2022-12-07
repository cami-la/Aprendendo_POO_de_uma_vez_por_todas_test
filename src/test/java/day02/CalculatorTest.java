package test.java.day02;

import main.java.day02.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
  private Calculator calculator;

  @ParameterizedTest
  @CsvSource({
      "+, 4d",
      "-, 0d",
      "*, 4d",
      "/, 1d"
  })
  void shouldReturnResultOperations(String sign, String result) {
    //given
    double value1 = 2d;
    double value2 = 2d;
    //when
    double actual = Calculator.calculate(value1, value2, sign.toCharArray()[0]);
    //then
    Assertions.assertEquals(actual, Double.valueOf(result));
  }

  @Test
  void shouldThrowArithmeticException_WhenValueOfDivisionZero() {
    //given
    double value1 = 2d;
    double value2 = 0d;
    char sign = '/';
    //when
    ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
      Calculator.calculate(value1, value2, sign);
    });
    //then
    String expected = "Division impossible!";
    Assertions.assertEquals(expected, actual.getMessage());
  }

  @Test
  void shouldThrowRuntimeException_WhenValueOfOperatiorInvalid() {
    //given
    double value1 = 2d;
    double value2 = 0d;
    char sign = '%';
    //when
    RuntimeException actual = assertThrows(RuntimeException.class, () -> {
      Calculator.calculate(value1, value2, sign);
    });
    //then
    String expected = "This sign " + sign + " is invalid!";
    Assertions.assertEquals(expected, actual.getMessage());
  }
}