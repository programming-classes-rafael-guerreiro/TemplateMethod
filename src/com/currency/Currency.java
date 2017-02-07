package com.currency;

import java.math.BigDecimal;

public interface Currency {
	String sign();

	String format(BigDecimal value);
}
