package topfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
	//Não aceita parametros e retorna o tipo T - parametro de retorno.
	
	static Supplier<Integer> getRandom = 
				() -> {Random r = new Random(); return r.nextInt(11);};
	public static void main(String[] args) {
		Supplier<String> getTitle = () -> "Title: <Title>";
		Supplier<List<String>> getList = () -> Arrays.asList("Pedro", "Ana", "Bia", "João");
				
		System.out.println(getTitle.get());
		System.out.println(getRandom.get());
		System.out.println(getList.get());
	}
}
