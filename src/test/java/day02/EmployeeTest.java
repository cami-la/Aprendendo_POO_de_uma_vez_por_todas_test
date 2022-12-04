package test.java.day02;

import main.java.day02.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
  private Employee employee;

  @BeforeEach
  void setUp() {
    this.employee = new Employee("Cami", BigDecimal.valueOf(100));
  }

  @Test
  void shouldReturnSalaryWithIncrement() {
    //given
    double percentualIncrement = 10;
    //when
    BigDecimal actual = this.employee.incremetSalary(percentualIncrement);
    //then
    BigDecimal expected = BigDecimal.valueOf(110.0);
    Assertions.assertEquals(expected, actual);
  }
}