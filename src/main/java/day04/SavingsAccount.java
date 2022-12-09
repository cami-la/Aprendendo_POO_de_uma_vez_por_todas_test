package main.java.day04;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {

  public SavingsAccount(String nameCustomer, BigDecimal balance) {

    this.balance = BigDecimal.valueOf(300d);
  }

  @Override
  public void toWithdraw(BigDecimal value) {

  }

  @Override
  public void toDeposit(BigDecimal value) {

  }
}
