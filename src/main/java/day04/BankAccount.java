package main.java.day04;

import java.math.BigDecimal;

public class BankAccount {
  //attributes
  private String number;
  private String nameCustomer;
  private BigDecimal balance;

  //constructor method
  public BankAccount(String number, String nameCustomer) {
    this.number = number;
    this.nameCustomer = nameCustomer;
    this.balance = BigDecimal.valueOf(300d);
  }

  //methods
  public void toWithdraw(BigDecimal value) {
    if(value.compareTo(BigDecimal.ZERO) <= 0 || this.balance.compareTo(value) <= -1) {
      throw new IllegalArgumentException("Invalid value to withdraw");
    } else {
      this.balance = this.balance.subtract(value);
    }
  }

  public void toDeposit(BigDecimal value) {
    if(value.compareTo(BigDecimal.ZERO) <= 0) {
      throw new IllegalArgumentException("Invalid value to deposit");
    } else {
      this.balance =  this.balance.add(value);
    }
  }

  public String getNumber() {
    return number;
  }

  public String getNameCustomer() {
    return nameCustomer;
  }

  public void setNameCustomer(String nameCustomer) {
    this.nameCustomer = nameCustomer;
  }

  public BigDecimal getBalance() {
    return balance;
  }
}
