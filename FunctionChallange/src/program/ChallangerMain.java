package program;

import classes.Product;

public class ChallangerMain {
	static MyFunctions function = new MyFunctions();
	
	public static void main(String[] args) {
		Product notebook = new Product("Notebook", 1499.99, 0.25);
		Product notebook2 = new Product("Notebook2", 3156.30, 0.25);
		Product backpack = new Product("BackPack", 119.99, 0.05);
		Product keyboard = new Product("Keyboard", 300.0, 0.10);
		
		print(function.priceWhitDiscountProduct.apply(notebook));
		print(function.priceWhitDiscountProduct.apply(notebook2));
		print(function.priceWhitDiscountProduct.apply(backpack));
		print(function.priceWhitDiscountProduct.apply(keyboard));

		
		l();
		
		print(function.cityTaxProduct.apply(notebook));
		print(function.cityTaxProduct.apply(notebook2));
		print(function.cityTaxProduct.apply(backpack));
		print(function.cityTaxProduct.apply(keyboard));
		
		l();
		
		print(function.freightProduct.apply(notebook));
		print(function.freightProduct.apply(notebook2));
		print(function.freightProduct.apply(backpack));
		print(function.freightProduct.apply(keyboard));
		
		l();
		
		print(function.reaisProduct.apply(notebook));
		print(function.reaisProduct.apply(notebook2));
		print(function.reaisProduct.apply(backpack));
		print(function.reaisProduct.apply(keyboard));
		
		l();
		print("TOTAL:");
		print(all(notebook));
		print(all(notebook2));
		print(all(backpack));
		print(all(keyboard));

	}
	
	private static String all(Product p) {
		return function.priceWhitDiscountProduct
		.andThen(function.cityTax)
		.andThen(function.freight)
		.andThen(function.reais)
		.apply(p);
	}
	
	private static void print(Object o) {
		System.out.println(o);
	}
	private static void l() {
		System.out.println();
	}
}
