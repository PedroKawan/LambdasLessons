package functions;

import java.math.BigInteger;
import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionMain {
	//Aceita dois argumento e retorna um valor int.
	
	public static void main(String[] args) {
		
		ToIntBiFunction<Integer, String> f = (x,y) -> {return x + Integer.parseInt(y);};
		int a = f.applyAsInt(4, "4");
		System.out.println(a);
		
		ToIntBiFunction<BigInteger,BigInteger> s = (x,y) -> x.add(y).intValue(); 
		Integer b = s.applyAsInt(new BigInteger("19854"), new BigInteger("91256"));
		System.out.println(b);
		

	}
}
