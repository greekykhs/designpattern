package com.designpattern.scenario1;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {
	/*
	 * 10% sales tax and 5 % import tax, ideally this should be configured in
	 * properties files.
	 */
	public static final BigDecimal SALES_TAX = BigDecimal.valueOf(0.10); 
    public static final BigDecimal IMPORT_TAX =  BigDecimal.valueOf(0.05);
	@Override
	public BigDecimal getCalculatedTax(boolean isSaleTaxable, boolean isImported, 
			BigDecimal price, int quantity) {
		if(price==null)
			throw new IllegalArgumentException("Price cannot be null");		
		
		BigDecimal tax = BigDecimal.ZERO;        
        if (isSaleTaxable) {
        	tax = price.multiply(SALES_TAX);
        }
        if (isImported) {
        	tax= tax.add(price.multiply(IMPORT_TAX));
        } 
        return tax.multiply(BigDecimal.valueOf(quantity));
	}

}
