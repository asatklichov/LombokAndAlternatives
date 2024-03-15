package net.sahet.autovalue.data.model;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AutoValueMoney extends AutoValueMoney {

  private final String currency;

  private final long amount;

  AutoValue_AutoValueMoney(
      String currency,
      long amount) {
    if (currency == null) {
      throw new NullPointerException("Null currency");
    }
    this.currency = currency;
    this.amount = amount;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

  @Override
  public long getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "AutoValueMoney{"
        + "currency=" + currency + ", "
        + "amount=" + amount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoValueMoney) {
      AutoValueMoney that = (AutoValueMoney) o;
      return this.currency.equals(that.getCurrency())
          && this.amount == that.getAmount();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= currency.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((amount >>> 32) ^ amount);
    return h$;
  }

}
