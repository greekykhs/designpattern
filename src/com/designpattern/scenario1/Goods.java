package com.designpattern.scenario1;

import java.math.BigDecimal;

public abstract class Goods {
	private String description;
	private int quantity;
	private BigDecimal price;

	/*
	 * Composition can be set at runtime via a setter method different
	 * implementations can be assigned to the interface
	 */
	private TaxCalculator taxCalculator = new TaxCalculatorImpl();

	public Goods(String description, int quantity, BigDecimal price) {
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	protected abstract boolean isSaleTaxable();
	protected abstract boolean isImported();

	public double getExtendedTax() {
		BigDecimal tax = taxCalculator.getCalculatedTax(isTaxed(), isImported(), price, quantity);
		return tax.doubleValue();
	}

	public double getExtendedTaxedPrice() {
		BigDecimal calculatedTax = taxCalculator.getCalculatedTax(isTaxed(), isImported(), price, quantity);
		BigDecimal extPrice = calculatedTax.add(price);
		return extPrice.doubleValue();
	}

	/*Getter Setters and toString()*/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [description=" + description + ", quantity=" + quantity + ", price=" + price + "]";
	}
}
