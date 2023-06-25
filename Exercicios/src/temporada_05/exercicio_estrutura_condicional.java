package temporada_05;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_estrutura_condicional {

	public static void main(String[] args) {
		// 1 -> Fazer um programa para ler um numero inteiro, e depois dizer se este numero é negativo ou não
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Por favor digite um numero: ");
		numero = sc.nextInt();
		
		if(numero < 0) {
			
			System.out.println("NEGATIVO");
			
		} else {
			
			System.out.println("NAO NEGATIVO");
		}
		sc.close(); 
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// 2 - Fazer um programa para ler um numero inteiro e dizer se este numero é PAR ou IMPAR
		
		int numero;
		
		System.out.println("Por favor digite um numero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("PAR");
			
		} else {
			
			System.out.println("IMPAR");
		}
		
		sc.close(); 
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		//  3 - Leia 2 valores inteiro (A e B). Apos, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Não sao Multiplos", indicando se os valoes lidos são multiplos entre si.
		   //  Atenção: os numero devem podem ser digitados em ordem crescente ou decres
		
		int A, B;
		
		System.out.println("Digite um valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Digite um valor de B: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			
			System.out.println("Sao Multiplos");
		
		} else {
			
			System.out.println("Nao Sao Multiplos");
		} 
		
		sc.close(); 
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// 4 -> Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia
		//      e terminar em outro, tendo uma duração minima de 1 hora e maxima de 24 horas.
		
		
		int hora_ini, hora_fim;
		int duracao;
		
		System.out.println("Digite a hora inicial: ");
		hora_ini = sc.nextInt();
		
		System.out.println("Digite a hora final: ");
		hora_fim = sc.nextInt();
		
		if(hora_ini < hora_fim) {
			
			duracao = hora_fim - hora_ini;
			
		} else {
			
			duracao = 24 - hora_ini + hora_fim;
			
		}
		
			System.out.printf("O Jogo durou " + duracao + " Hora(s)");
			
			sc.close(); 
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// 5 -> Com base na tabela abaixo, escreva um programa que leia o codigo de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a o pagar.
	
		int codigo;
		double preco, total, qty;
		
		System.out.print("Digite o código do produto: ");
		codigo = sc.nextInt();
		
		switch(codigo) {
		
			case 1:
			
				System.out.println("Cachorro Quente");		
				break;
			
			case 2:
			
				System.out.println("X-Salada");		
				break;
			
			case 3:
			
				System.out.println("X-Bacon");		
				break;
				
			case 4:
				
				System.out.println("Torrada Simples");		
				break;
				
			case 5:
				
				System.out.println("Refrigerante");		
				break;
				
			default:
				
				System.out.println("Não foi encontrado nenhum produto com esse código");
				break;
		}
		
		System.out.print("Digite a quantidade: ");
		qty = sc.nextDouble();
		
		System.out.print("Digite o preco unitario R$: ");
		preco = sc.nextDouble();
		
		total = preco * qty;
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor total é R$ %.2f%n ", total);
		
		sc.close();
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// 6 -> Voce deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual seguintes intervalos([0,25],
		//     [25,50], [50,75], [75,100] este valor se encontra. Obviamente se o valor não estiver em enhum deste intervalos, devera ser impressa
		//     a mensagem "Fora de intervalo".
	 
		double valor;		
		System.out.print("Digite o valor: ");
		valor = sc.nextDouble();
		
		if(valor == 0 && valor <= 25.00) {
			
			System.out.print("Intervalo [0,25]");
			
		} else if (valor >= 25.01 && valor <= 50.74 ) {
			
			System.out.print("Intervalo [25,50]");
			
		} else if (valor >= 50.75 && valor <= 100.00 ) {
			
			System.out.print("Intervalo [75,100]");
			
		} else {
			
			System.out.print("Fora de intervalo");
			
		}
		
		sc.close(); 
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// 7 -> Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		//		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		//		Se o ponto estiver na origem, escreva a mensagem “Origem”.
		//		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		//		situação. 
		
		double x, y;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextDouble();
		
		System.out.print("Digite o valor de Y: ");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			
			System.out.print("Origem");
			
		} else if (x > 0 && y > 0 ) {
			
			System.out.print("Q1");
			
		} else if (x < 0 && y > 0 ) {
			
			System.out.print("Q2");
			
		}  else if (x < 0 && y < 0 ) {
			
			System.out.print("Q3");
			
		} else if (x > 0 && y < 0 ) {
			
			System.out.print("Q4");
		}
		
		sc.close();
		
		// 8 -> Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		// que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		// qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		// mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		
		// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		// salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		// de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		// duas casas decimais.
		
		double salario, renda;
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o valor do salario R$: ");
		salario = sc.nextDouble();
		
		 	if(salario <= 2000.0) {
			
		 		renda = 0.0;
		 		
		 		System.out.println("Isento");
			
		 	} else if (salario <= 3000.0) {
			 
		 		renda = (salario - 2000.0) * 0.08;
			 
		 		System.out.printf("O valor do IR e de R$ : %.2f%n", renda);
			 
		 	} else if (salario <= 4500.0) {
			 
		 		renda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		 
		 		System.out.printf("O valor do IR e de R$ : %.2f%n", renda);
		 		
		 	} else {
		 		
		 		renda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
				 
		 		System.out.printf("O valor do IR e de R$ : %.2f%n", renda);
		 	
		 	}
		
		sc.close();
	}

}
