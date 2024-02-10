package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		// Nesse faz o tratamento especial
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		// Nesse não faz o tratamento especial
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		// Esse daqui compara as referencia e não o que vem da memoria
		System.out.println(c1 == c2);
		
		System.out.println(s1 == s2);
	}

}
