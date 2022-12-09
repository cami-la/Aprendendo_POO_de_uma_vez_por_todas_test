package test.java.day04;

import main.java.day04.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
  private BankAccount bankAccount;

  @BeforeEach
  void setUp() {
    bankAccount = new BankAccount("123456", "Cami");
  }

  @ParameterizedTest
  @MethodSource("bigDecimalProvider")
  void shouldThrowIllegalArgumentException_WhenValuesIsZero(BigDecimal valuetoWithdraw) {
    //given
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      bankAccount.toWithdraw(valuetoWithdraw);
    });
    //then
    String expected = "Invalid value to withdraw";
    Assertions.assertEquals(expected, actual.getMessage());
  }

  @ParameterizedTest
  @CsvSource({
      "300, 0",
      "100, 200"
  })
  void shouldWithdrawValue_WhenValueIsSameAsBalance(String valueToWithdraw, String result) {
    //given
    //when
    bankAccount.toWithdraw(new BigDecimal(valueToWithdraw));
    BigDecimal actual = bankAccount.getBalance();
    actual = actual.setScale(2, RoundingMode.HALF_EVEN);
    //then
    BigDecimal expected = new BigDecimal(result);
    expected = expected.setScale(2, RoundingMode.HALF_EVEN);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldThrowIllegalArgumentException_WhenTrytoDepositValuesIsZero() {
    //given
    BigDecimal value = BigDecimal.ZERO;
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      bankAccount.toDeposit(value);
    });
    //then
    String expected = "Invalid value to deposit";
    Assertions.assertEquals(expected, actual.getMessage());
  }

  @Test
  void shouldThrowIllegalArgumentException_WhenTryToDepositValuesIsLessThan0() {
    //given
    BigDecimal value = BigDecimal.valueOf(-10);
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      bankAccount.toDeposit(value);
    });
    //then
    String expected = "Invalid value to deposit";
    Assertions.assertEquals(expected, actual.getMessage());
  }

  @Test
  void shouldDepositValue() {
    //given
    BigDecimal valueToDeposit = BigDecimal.TEN;
    //when
    bankAccount.toDeposit(valueToDeposit);
    BigDecimal actual = bankAccount.getBalance();
    //then
    BigDecimal expected = BigDecimal.TEN;
    Assertions.assertEquals(expected, actual);
  }

  static Stream<BigDecimal> bigDecimalProvider() {
    return Stream.of(BigDecimal.ZERO, BigDecimal.valueOf(-100), BigDecimal.valueOf(350));
  }

}