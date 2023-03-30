package topfunctions;

import java.util.function.BiFunction;

public class BiFunctionMain {
	//Aceita dois parametros T, S, R - sendo R o tipo de retorno.
	
	public static void main(String[] args) {
		BiFunction<Boolean,Boolean,Integer> bi = (x, y) -> { 
			return (x == true && y == true) ? 1 : 0;
		};
		
		System.out.println(bi.apply(true, true));

	}
	
}
