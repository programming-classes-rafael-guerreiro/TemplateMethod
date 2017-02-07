package com.currency;

import java.math.BigDecimal;

public class Dollar extends CurrencyWithSignFirst implements Currency {
	@Override
	public String sign() {
		return "$";
	}

	@Override
	protected String getValueAsString(BigDecimal value) {
		return value.toPlainString();
	}
}
