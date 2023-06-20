package temporada_05;

import java.util.Calendar;
import java.util.Scanner;

public class exercicio_estrutura_condicional {

	public static void main(String[] args) {
		// 1 -> Fazer um programa para ler um numero inteiro, e depois dizer se este numero é negativo ou não
		Scanner sc = new Scanner(System.in);
		
		/*int numero;
		
		System.out.println("Por favor digite um numero: ");
		numero = sc.nextInt();
		
		if(numero < 0) {
			
			System.out.println("NEGATIVO");
			
		} else {
			
			System.out.println("NAO NEGATIVO");
		}*/
		
		// 2 - Fazer um programa para ler um numero inteiro e dizer se este numero é PAR ou IMPAR
		
		/*int numero;
		
		System.out.println("Por favor digite um numero: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("PAR");
			
		} else {
			
			System.out.println("IMPAR");
		}*/
		
		//  3 - Leia 2 valores inteiro (A e B). Apos, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Não sao Multiplos", indicando se os valoes lidos são multiplos entre si.
		   //  Atenção: os numero devem podem ser digitados em ordem crescente ou decres
		
		/*int A, B;
		
		System.out.println("Digite um valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Digite um valor de B: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			
			System.out.println("Sao Multiplos");
		
		} else {
			
			System.out.println("Nao Sao Multiplos");
		} */
		
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
	}

}
