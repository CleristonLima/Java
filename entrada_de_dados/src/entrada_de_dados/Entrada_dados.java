package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_dados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc  = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		//Encerra o recurso
		//sc.close();
		
	 System.out.println("------------------------------------------------------------------------");
		
	  System.out.println("Exemplo 2 -> Int");
	  
	 	
		int a;
		a = sc.nextInt();
		System.out.println("Voce digitou: " + a);
		
		//Encerra o recurso
		//sc.close();

		System.out.println("------------------------------------------------------------------------");
		
		  System.out.println("Exemplo 3 -> Double");
		  
		  double b;
		  b = sc.nextDouble();
		  System.out.printf("Voce digitou: %.2f%n", b);
		  
		//  sc.close();
		  
		  System.out.println("------------------------------------------------------------------------");
			
		  System.out.println("Exemplo 4 -> Caractere");
		  
		  char c;
		  c = sc.next().charAt(0);
		  System.out.println("Voce digitou: " + c);
		  
		 // sc.close();
		  
		  System.out.println("------------------------------------------------------------------------");
			
		  System.out.println("Exemplo 5 -> Lendo varios dados na mesma linha");
		  
		  String e;
		  int f;
		  double h;
		  
		  e = sc.next();
		  f = sc.nextInt();
		  h = sc.nextDouble();
		  
		  System.out.println("Dados digitados: ");
		  System.out.println(e);
		  System.out.println(f);
		  System.out.println(h);
		  
		  sc.close();
	}

}
