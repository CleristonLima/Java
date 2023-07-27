package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		// Para inserir um novo elemento em alguma posição
		list.add(2, "Marco");
		
		// ver o tamanho
		System.out.println(list.size());
		
		// remover
		//list.remove("Ana");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------------");
		
		// remove na posicao
		//list.remove(1);
				
		// remover por um predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------------");
		// Para encontrar a posição do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-------------------------------------------------------");

		// Para trazer a lista somente com o elemento
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------------");
		
		/// Ele vai procurar o primeiro elemento que comeca com a letra
		// Caso ele não encontre ele retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}
	

}
