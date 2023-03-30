package functions;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionChaining {
	public static void main(String[] args) {
		Supplier<String> zero = () -> "0";
		Function<String, String> fist = x -> "1- " + x + " -1"; 
		Function<String, String> second = x -> "2- " + x + " -2"; 
		Function<String, String> third = x -> "3- " + x + " -3"; 
		
		//left to right order
		String result = fist.andThen(second)
				.andThen(third).apply(zero.get());

		System.out.println(result);
	}
}
