package main.java.day05.bank;

import java.math.BigDecimal;

public class Account {
  //attributes
  private int number;
  private BigDecimal balance;

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

  public BigDecimal getBalance() {
    return balance;
  }
}
