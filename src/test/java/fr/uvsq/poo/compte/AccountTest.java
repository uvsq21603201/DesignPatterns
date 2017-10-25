package fr.uvsq.poo.compte;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class AccountTest {
  BigDecimal amount;

  @Before
  public void setup() {
    amount = new BigDecimal("100");
  }

  @Test
  public void anAccountCreatedWithAnAmountShouldHaveABalanceEqualsToThisAmount() {
    Account account = new Account(amount);
    assertThat(account.getBalance(), is(equalTo(amount)));
  }
}