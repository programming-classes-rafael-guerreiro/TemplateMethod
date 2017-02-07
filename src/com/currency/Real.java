package com.currency;

import java.math.BigDecimal;

public class Real extends CurrencyWithSignFirst implements Currency {
	@Override
	public String sign() {
		return "R$";
	}

	@Override
	protected String getValueAsString(BigDecimal value) {
		return value.toPlainString().replace(".", ",");
	}
}
