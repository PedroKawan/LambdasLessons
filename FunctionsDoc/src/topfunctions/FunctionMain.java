package topfunctions;

import java.math.BigInteger;
import java.util.function.Function;

public class FunctionMain {
	//Aceita dois parametros T, S e retorna o tipo S.
	
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("123456");
		
		//Return the first number of the BigInteger.
		Function<BigInteger, String> fist = x -> x.toString().substring(0,1);
			
			
		//Return the last number of the BigInteger.
		Function<BigInteger,String> second = x -> x.toString()
				.substring(x.toString().length()-1);
			
		String concat = fist.apply(bi) + "-" + second.apply(bi);
		
		
		System.out.println(concat);
		Function<String,Number> result = x -> Integer.parseInt(x);
		
		System.out.println(result.apply("12"));
	}
	

}
