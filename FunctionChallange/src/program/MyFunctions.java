package program;

import java.math.BigDecimal;
import java.util.function.Function;

import classes.Product;

public class MyFunctions {
	public Function<Product, Double> priceWhitDiscountProduct= x -> {
		BigDecimal price = new BigDecimal(x.getPrice().toString());
		BigDecimal discount = new BigDecimal(x.getDiscount().toString());
		
		discount = new BigDecimal("1").subtract(discount);	
		Double tot = price.multiply(discount).doubleValue();
		
		return tot;
	};
	
	public Function<Product, Double> cityTaxProduct = x -> {
		BigDecimal price = new BigDecimal(x.getPrice().toString());
		BigDecimal tax = new BigDecimal("0.085");
		tax = price.multiply(tax);
		
		return (x.getPrice() < 2500) ? x.getPrice() 
				: price.doubleValue() + tax.doubleValue();
	};
	
	public Function<Product, Double> freightProduct = x -> {
		BigDecimal price = new BigDecimal(x.getPrice().toString());
		BigDecimal freight1 = new BigDecimal("100");
		BigDecimal freight2 = new BigDecimal("50");
		
		price =  (x.getPrice() < 3000) ? price.add(freight2)
				: price.add(freight1);
		
		return price.doubleValue();
	};
	
	public Function<Product, String> reaisProduct =
			x -> String.format("%.2f", x.getPrice());
	
			
			
	public Function<Double, Double> cityTax = x -> {
		BigDecimal price = new BigDecimal(x.toString());
		BigDecimal tax = new BigDecimal("0.085");
		tax = price.multiply(tax);
		
		return (x < 2500) ? x : price.doubleValue() + tax.doubleValue();
	};
	
	public Function<Double, Double> freight = x -> {
		BigDecimal price = new BigDecimal(x.toString());
		BigDecimal freight1 = new BigDecimal("100");
		BigDecimal freight2 = new BigDecimal("50");
		
		price =  (x < 3000) ? price.add(freight2)
				: price.add(freight1);
		
		return price.doubleValue();
	};
	
	public Function<Double, String> reais =
			x -> String.format("R$%.2f", x);
			
	
}
