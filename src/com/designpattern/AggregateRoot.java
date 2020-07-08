package com.designpattern;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AggregateRoot {
	public static void main(String[] args) {
	}
}
class Product {
    private String id;
    private String name;
    private BigDecimal quantity;
    //no setters, only getters 
}

class Order {
	private String id;
	private String orderName;
	private List<Product> products;
	//no setters
	//getters for only id and orderName only

	//constructor..
	
	public void addProduct(Product product) {
		//add product only after performing validation
		//duplicate product not allowed or
		//the size of p[roducts should not exceed by 10 etc
		products.add(product);
	}
	
	/* Enumeration has only read-only access to the 
	 * elements in a collection. Since we do not want anyone to modify
	 * the product list we are returning Enumeration.*/
	public Enumeration<Product> getProductEnumeration() {
		return Collections.enumeration(products);
	}
}