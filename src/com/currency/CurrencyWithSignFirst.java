package com.currency;

import java.math.BigDecimal;

public abstract class CurrencyWithSignFirst implements Currency {
	@Override
	public final String format(BigDecimal value) {
		return sign() + " " + getValueAsString(value);
	}

	protected abstract String getValueAsString(BigDecimal value);
}