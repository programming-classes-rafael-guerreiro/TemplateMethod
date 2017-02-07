package com.currency;

import java.math.BigDecimal;

public class Euro implements Currency {
	@Override
	public String sign() {
		return "€";
	}

	@Override
	public String format(BigDecimal value) {
		return value.toPlainString() + sign();
	}
}
