package com.designpattern.scenario1;

import java.math.BigDecimal;

public class Book extends Goods {

	public Book(String description, int quantity, BigDecimal price) {
        super(description, quantity, price);
    }
	@Override
	protected boolean isSaleTaxable() {
		return false;
	}

	@Override
	protected boolean isImported() {
		return false;
	}
}
