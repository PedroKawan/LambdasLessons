package functions;

import java.util.function.ToIntFunction;

public class ToIntFunctionMain {
	//Aceita um argumento e retorna um valor int.
	
	public static void main(String[] args) {
		ToIntFunction<String> f = (x) -> Integer.parseInt(x);
		System.out.println(f.applyAsInt("951581"));
		
		
		ToIntFunction<String> s = (x) -> {
			try {
				return Integer.parseInt(x);
			} catch (NumberFormatException e) {
				return 0; 
			}
		};
		System.out.println(s.applyAsInt("asdf"));
	}

}
