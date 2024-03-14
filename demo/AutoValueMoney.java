package net.sahet.autovalue.demo;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueMoney {
	public abstract String getCurrency();

	public abstract long getAmount();

	/**
	 * Basic usage of AutoValue using a static factory method as our public creation
	 * API.
	 * 
	 * @param currency
	 * @param amount
	 * @return
	 */
	public static AutoValueMoney create(String currency, long amount) {
		return new AutoValue_AutoValueMoney(currency, amount);
	}
}
