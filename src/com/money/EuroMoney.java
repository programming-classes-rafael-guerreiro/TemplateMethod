package com.money;

import java.math.BigDecimal;

import com.currency.Currency;
import com.currency.Euro;

public class EuroMoney extends Money {
	public EuroMoney(BigDecimal value) {
		super(new Euro(), value);
	}

	@Override
	public Euro getCurrency() {
		return (Euro) super.getCurrency();
	}
}
