package topfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import classes.Product;
public class ConsumerMain {
	//Aceita um parametro e retorna void;
	
	public static void main(String[] args) {
		Consumer<Product> info = x -> {
			System.out.println("\nPrice: " + x.getPrice());
			System.out.println("With Discount:" + (x.getPrice() - x.getDiscount()));
		};
			Product p1 = new Product("Backpack", 60.0, 5.0);
			info.accept(p1);
			
			Product p2 = new Product("Notebook", 3000.0, 100.0);
			Product p3 = new Product("PC", 4989.99, 200.0);
			Product p4 = new Product("Book", 50.0, 5.0);
			List<Product> list = Arrays.asList(p1, p2, p3, p4);
			
			//Is also a Consumer.
			list.forEach(info);
			
//			list.forEach(info::accept);
	}
}
