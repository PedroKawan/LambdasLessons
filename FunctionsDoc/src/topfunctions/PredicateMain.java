package topfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import classes.Product;

public class PredicateMain {
	
	public static void main(String[] args) {
		//Aceita um parametro e retorna boolean.
		
		Product p = new Product("Keyboard", 350.0, 40.0);
		
//		Predicate<Product> isExpensive =
//				(x) -> (x.getPrice() - x.getDiscount()) >= 300;
				Predicate<Product> isExpensive = (x) -> {
					boolean exp = (x.getPrice() - x.getDiscount()) >= 300;
					System.out.println(x + ": " + exp);
					return exp;
				};
			
		System.out.println(isExpensive.test(p));
		System.out.println(isExpensive.test(new Product("Keyboard2", 330.0, 40.0)));
		
		System.out.println();
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("Mouse", 300.0, 20.0));
		products.add(new Product("Keyboard", 300.0, 20.0));
		products.add(new Product("Monitor", 1100.0, 150.0));
		products.add(new Product("MousePad", 100.0, 0.0));
		
		isExpensive.test(products.get(3));
		
		l();
		
		products.forEach(PredicateMain::printProduct);
		
		l();

		products.forEach(isExpensive::test);
//		products.forEach(a -> isExpensive.test(a));
	}
	
	public static void printProduct(Product p) {
		System.out.println(p);
	}
	
	public static void l() {
		System.out.println();
	}


}
