package com.designpattern.scenario1;

import java.math.BigDecimal;

public class CDs extends Goods {

	public CDs(String description, int quantity, BigDecimal price) {
        super(description, quantity, price);
    }
	@Override
	protected boolean isSaleTaxable() {
		return true;
	}

	@Override
	protected boolean isImported() {
		return true;
	}
}
