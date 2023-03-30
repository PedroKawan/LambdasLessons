package topfunctions;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
	//Aceita dois argumentos e retorna o parametro especificado.
	
	public static void main(String[] args) {
		BinaryOperator<String> concatLine = (x, y) -> x + "_" + y;
		BinaryOperator<Double> multiply = (x, y) -> {
			BigDecimal a = new BigDecimal(x.toString());
			BigDecimal b = new BigDecimal(y.toString());
				return a.multiply(b).doubleValue();
		};
		
		System.out.println(concatLine.apply("Meu nome é", "Pedro"));
		System.out.println(multiply.apply(0.023, 10.0));
		System.out.println(0.023 * 10.0);
		
		
	}
}
