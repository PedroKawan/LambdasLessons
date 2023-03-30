package functions;

import java.util.function.BiConsumer;

public class BiConsumerMain {
	//Aceita um argumento e retorna (void).
	
	public static void main(String[] args) {
		BiConsumer<Character, String> bi = (x,y) -> System.out.println(x + ": " + y);; 
		bi.accept('A', "Ana");
		bi.accept('B', "Bernado");
		bi.accept('C', "Carlos");
		
	}

}
