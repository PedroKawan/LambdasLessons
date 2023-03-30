package functions;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ACMain {
	public static void main(String[] args) {
		Function<BigInteger, Double> sum = x -> x.doubleValue() + x.doubleValue();
		UnaryOperator<Double> squared = x -> x * x;

		BigInteger bi = new BigInteger("2");

		// runned fist 'sum' and then 'squared' - from left to right
		double result1 = sum.andThen(squared).apply(bi);

		System.out.println(result1);

		// runned fist 'sum' and then 'squared' - from right to left
		double result2 = squared.compose(sum).apply(bi);
		System.out.println(result2);
	}
}
