package main.java.day02;

public class Calculator {
  public static double calculate(double value1, double value2, char sign) {
    if (sign == '+') {
      return value1 + value2;
    } else if (sign == '-') {
      return value1 - value2;
    } else if (sign == '*') {
      return value1 * value2;
    } else if (sign == '/') {
      if (value2 == 0) {
        throw new ArithmeticException("Division impossible!");
      }
      return value1 / value2;
    } else {
      throw new RuntimeException("This sign " + sign + " is invalid!");
    }
  }
}
