package Beans;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private Map<String,Products> productsMap = new HashMap<String,Products>();

	public Map<String, Products> getProductsMap() {
		return productsMap;
	}

	public void setProductsMap(Map<String, Products> productsMap) {
		this.productsMap = productsMap;
	}
	
	
}
