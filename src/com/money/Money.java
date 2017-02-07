package com.money;

import java.math.BigDecimal;

import com.currency.Currency;

public class Money {
	private final Currency currency;
	private final BigDecimal value;

	public Money(Currency currency, BigDecimal value) {
		if (currency == null)
			throw new IllegalArgumentException("Currency is required.");
		if (value == null)
			throw new IllegalArgumentException("Value is required.");

		this.currency = currency;
		this.value = value;
	}

	public String getFormattedValue() {
		return currency.format(value);
	}

	public Currency getCurrency() {
		return currency;
	}

	public BigDecimal getValue() {
		return value;
	}
}
