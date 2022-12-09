package main.java.day04;

import java.math.BigDecimal;

public abstract class BankAccount {
  //attributes
  protected String number;
  protected String nameCustomer;
  protected BigDecimal balance;

  //methods
  public abstract void toWithdraw(BigDecimal value);

  public abstract void toDeposit(BigDecimal value);

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNameCustomer() {
    return nameCustomer;
  }

  protected void setNameCustomer(String nameCustomer) {
    this.nameCustomer = nameCustomer;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  protected void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
