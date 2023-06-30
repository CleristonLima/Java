package temporada_06_Comando_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_repeticao_for {

	public static void main(String[] args) {
		
		/*1 -> Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
			  X, se for o caso. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de X: ");
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++){
			
			if(i % 2 != 0) {
				
				System.out.println(i);
			}
		}
		
		
		sc.close();
		
		System.out.print("--------------------------------------------------------------------");
		
		/* 2 -> Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
			  Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
			  essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		*/
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor de N, pois e a quantidade de valores: ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Digite um valor de X: ");
			int x = sc.nextInt();
			
				if (x >= 10 && x <= 20) {
				
					in = in + 1;
				
				} else {
				
					out = out + 1;
				}
			
			}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
		
		System.out.print("--------------------------------------------------------------------");
		
		/* 3 -> Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
			   de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
			   conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
			   peso 5. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de N, pois e a quantidade de testes: ");
		int n = sc.nextInt();
		
			for (int i=0; i<n; i++) {
			
				System.out.print("Digite o valor de A: ");
				double a = sc.nextDouble();
				
				System.out.print("Digite o valor de B: ");
				double b = sc.nextDouble();
				
				System.out.print("Digite o valor de C: ");
				double c = sc.nextDouble();
				
				double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
				
				System.out.printf("O valor da media:  %.1f%n", media);
			
			}
		
		sc.close();
		
		System.out.print("--------------------------------------------------------------------");
		
		/* 4 -> Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
			    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de N, para ler quantas vezes for necessário: ");
		int n = sc.nextInt();
		
			for (int i=0; i<n; i++) {
			
				System.out.print("Digite o valor do dividendo: ");
				int dividendo = sc.nextInt();
				
				System.out.print("Digite o valor do divisor: ");
				int divisor = sc.nextInt();
				
					if (divisor == 0) {
						
						System.out.println("Divisao impossivel!!");
							
					} else {
						
						double resultado = (double) dividendo / divisor;						
						System.out.printf("O resultado é: %.1f%n", resultado);
						
					}
			
			}
		
		sc.close();
		
		System.out.print("--------------------------------------------------------------------");
		
		/* 5 -> Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		  		Lembrando que, por definição, fatorial de 0 é 1.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de N, para ler um fatorial: ");
		int n = sc.nextInt();
		
		int fatorial = 1;
		
			for (int i=1; i<=n; i++) {
				
				fatorial = fatorial * i;
			
			}
			
			System.out.println(fatorial);
		
		sc.close();
		
		System.out.print("--------------------------------------------------------------------");
		
		/* 6 -> Ler um número inteiro N e calcular todos os seus divisores. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de N, para calcular os dividores ");
		int n = sc.nextInt();
		
			for (int i=1; i<=n; i++) {
				
				if (n % i == 0) {
					
					System.out.println(i);
				}
				
			}
		
		sc.close();
		
		System.out.print("--------------------------------------------------------------------");
		
		/*7 -> Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
			   começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
			   exemplo. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor de N, para mostar as linhas:  ");
		int n = sc.nextInt();
		
			for (int i=1; i<=n; i++) {
				
				int primeiro = i;
				int segundo = i * i;
				int terceiro = i * i * i;
				
				System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			
			}
		
		sc.close();
		
	}

}
