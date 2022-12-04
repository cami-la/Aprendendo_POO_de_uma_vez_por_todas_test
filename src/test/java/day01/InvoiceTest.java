package test.java.day01;

import main.java.day01.Invoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class InvoiceTest {
  private Invoice invoice;

  @BeforeEach
  void setup() {
    this.invoice = new Invoice(123L, "Description Item", 3, BigDecimal.TEN);
  }

  @Test
  void shouldReturnInvoiceAmount() {
    //given
    //when
    BigDecimal actual = this.invoice.getInvoiceAmount();
    //then
    BigDecimal expected = BigDecimal.valueOf(30);
    Assertions.assertEquals(expected, actual);
  }
}