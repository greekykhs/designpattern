package com.designpattern.scenario1;

import java.math.BigDecimal;

public interface TaxCalculator {
	BigDecimal getCalculatedTax(boolean isTaxable, boolean isImported, 
			BigDecimal price, int quantity);
}
