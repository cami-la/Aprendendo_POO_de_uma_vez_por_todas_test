package test.java.day01;

import main.java.day01.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class ClientTest {
  private Client client;

  @BeforeEach
  void setUp() {
    client = new Client();
  }

  @Test
  void shouldReturnCurrentAge() {
    //given
    LocalDate birthDay = LocalDate.of(1994, Month.JANUARY, 13);
    client.setBirthDate(birthDay);
    //when
    int actual = client.calculateAge();
    //then
    int expected = 28;
    Assertions.assertEquals(actual, expected);
  }
}