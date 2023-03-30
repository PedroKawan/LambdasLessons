package classes;

public class Product {
	
	private final String name;
	private Double price;
	private Double discount;
	
	public Product(String name, Double price, Double discount) {
		this.name = name;
		this.setPrice(price);
		this.setDiscount(discount);
	}

	
	public Double getPrice() {
		return price;
	}


	private void setPrice(Double price) {
		price = verify(price);
		this.price = price;
	}


	public Double getDiscount() {
		return discount;
	}


	private void setDiscount(Double discount) {
		this.discount = discount;
	}


	public String getName() {
		return name;
	}


	public Double verify(Double d) {
		String s = d.toString();
		String ns;
		int index = s.indexOf(".");
		
		ns = s.substring(0,index);
		s = s.substring(index + 1);

		if(s.equals("99")) return Double.parseDouble(ns) + 1.0;
		return d;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
