package net.sahet.autovalue.demo;

public class MutableMoney {
	private long amount;
	private String currency;

	public MutableMoney(long amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
