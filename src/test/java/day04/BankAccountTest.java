package test.java.day04;

import main.java.day04.SavingsAccount2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
  private SavingsAccount2 bankAccount;

  @BeforeEach
  void setUp() {
    bankAccount = new SavingsAccount2("123456", "Cami");
  }

  @ParameterizedTest
  @MethodSource("bigDecimalProviderToWithdraw")
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

  @ParameterizedTest
  @MethodSource("bigDecimalProviderToDeposit")
  void shouldThrowIllegalArgumentException_WhenTryToDepositValuesIsLessThan0(BigDecimal valuetoWithdraw) {
    //given
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      bankAccount.toDeposit(valuetoWithdraw);
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

  static Stream<BigDecimal> bigDecimalProviderToWithdraw() {
    return Stream.of(BigDecimal.ZERO, BigDecimal.valueOf(-100), BigDecimal.valueOf(350));
  }

  static Stream<BigDecimal> bigDecimalProviderToDeposit() {
    return Stream.of(BigDecimal.ZERO, BigDecimal.valueOf(-100));
  }
}