package main.java.day02;

import java.math.BigDecimal;

public class Employee {
  //attribute
  private String name;
  private BigDecimal salary;

  //constructor method
  public Employee(String name, BigDecimal salary) {
    this.name = name;
    this.salary = salary;
  }

  //methods
  public BigDecimal incremetSalary(double percentageIncrease) {
    BigDecimal percentagemIncreaseBigDecimal = BigDecimal.valueOf(1 + (percentageIncrease / 100));
    return this.salary.multiply(percentagemIncreaseBigDecimal);
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }
}
