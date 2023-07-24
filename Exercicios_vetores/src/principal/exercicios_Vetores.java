package principal;

import java.util.Locale;
import java.util.Scanner;

public class exercicios_Vetores {

	public static void main(String[] args) {
		
		/*
		 * 1 -> Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
				e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
				
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você irá digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
			for (int i=0; i<n; i++) {
				
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt();
				
			}
			
			System.out.println("NUMEROS NEGATIVOS: ");
			
			for (int i=0; i<n; i++) {
				
				if(vect[i] < 0) {
					
					System.out.printf("%d\n", vect[i]);
				}
			}
			
		sc.close();
		
		System.out.println("---------------------------------------------------------------");
		
		/*
		 * 2 -> Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
				- Imprimir todos os elementos do vetor
				- Mostrar na tela a soma e a média dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você irá digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for (int i=0; i<n; i++) {
			
			System.out.printf("%.2f ", vect[i]);
			
		}
		
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		System.out.println();
		System.out.printf("SOMA = %.2f", sum);
		
		double avg = sum / n;
		
		System.out.println();
		System.out.printf("MEDIA = %.2f", avg);
		
		sc.close();
		
		System.out.println("---------------------------------------------------------------");
		
		/*
		 * 3 -> Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
				tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
				bem como os nomes dessas pessoas caso houver.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		int nmenores;
		double alturaTotal, alturaMedia, percentual;
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
			for (int i=0; i<n; i++) {
			
				sc.nextLine();
				System.out.println();
				System.out.printf("Dados da %da pessoa: \n", i + 1);
				System.out.println();
				
				System.out.printf("Digite o nome: ");
				name[i] = sc.nextLine();
				
				System.out.printf("Digite a idade: ");
				age[i] = sc.nextInt();
				
				System.out.printf("Digite a altura: ");
				height[i] = sc.nextDouble();
				
			}
			
		nmenores = 0;
		alturaTotal = 0;
		
			for(int i=0; i<n; i++) {
				
				if(age[i] < 16) {
					
					nmenores++;
				}
				
				alturaTotal = alturaTotal + height[i];
			}
			
			alturaMedia = alturaTotal / n;
			percentual = ((double)nmenores /n) * 100.0;
			
			System.out.printf("\nAltura Media: %.2f\n", alturaMedia);
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
		
				for(int i=0; i<n; i++) {
					
					if(age[i] < 16) {
						
						System.out.printf("%s\n", name[i]);
					}
				}
		
		sc.close();
		
		System.out.println("---------------------------------------------------------------");
		
		/*
		 * 4 -> Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
				tela todos os números pares, e também a quantidade de números pares.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		int qtdPares = 0;
		
		for (int i=0; i<n; i++) {
		
			if(vect[i] % 2 == 0) {
				
				System.out.printf("%d ", vect[i]);
				qtdPares++;
			}
		}
		System.out.println();
		System.out.printf("\nQUANTIDADE DE PARES = %d\n", qtdPares);
		
		
		
		sc.close();
		
		System.out.println("---------------------------------------------------------------");
		
		/* 5-> Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
			   o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		  	   considerando a primeira posição como 0 (zero). */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maiorValor = vect[0];
		int posicaoMaior = 0;
		
		for (int i=1; i<n; i++) {
			
			if(vect[i] > maiorValor) {
				
				maiorValor = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f\n", maiorValor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoMaior);
		
		sc.close();
		
		System.out.println("---------------------------------------------------------------");
		
		/* 6 -> Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
				terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
				o vetor C gerado. */
		
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] somaVetores = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
			for (int i=0; i<n; i++) {
				
				vectA[i] = sc.nextInt();
			
			}
		
		System.out.println("Digite os valores do vetor B: ");
		
			for (int i=0; i<n; i++) {
			
				vectB[i] = sc.nextInt();
				
			}
			
			System.out.print("VETOR RESULTANTE: ");
			
			for (int i=0; i<n; i++) {
				
				somaVetores[i] = vectA[i] + vectB[i];
				System.out.printf("\n%d", somaVetores[i]);
			}
		
		sc.close(); 
		
		System.out.println("---------------------------------------------------------------");
		
		/* 7 -> Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
				mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
				os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sum = 0;
		
			for (int i=0; i<n; i++) {
			
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextDouble();
			}
		
			for (int i=0; i<n; i++) {
				
				sum += vect[i];
			}
			
		double media = sum /n;
		
		System.out.println("\nMEDIA DO VETOR = " + media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i=0; i<n; i++) {
			
			if(vect[i] < media) {
				
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		sc.close(); 
		
		System.out.println("---------------------------------------------------------------");
		
		/*
		 *  8 -> Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
				 aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
				 digitado, mostrar a mensagem "NENHUM NUMERO PAR"
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int npares = 0;
		int sum = 0;
		double media;
		
		
			for (int i=0; i<n; i++) {
			
				System.out.print("Digite um numero: ");
				vect[i] = sc.nextInt();
			
			}
			
			for (int i=0; i<n; i++) {
				
				if(vect[i] % 2 == 0) {
					
					sum = sum + vect[i];
					npares ++;
				
				}
				
			}
			
			if(npares == 0) {
			
				System.out.println("NENHUM NUMERO PAR");
			
			} else {
				
				media = (double)sum / npares;
				
				System.out.printf("MEDIA DOS PARES = %.1f\n", media);
			}
			
		sc.close();		
		
		System.out.println("---------------------------------------------------------------");
		
		/* 
		 * 9 -> Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
				devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
				da pessoa mais velha.
		 */
		
		 Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
	    int[] idade = new int[n];
	    
	    int nMaisVelho = idade[0];
	    int posicaoMaior = 0;
	    
	    for (int i=0; i<n; i++) {
	    	
	    	sc.nextLine();
			System.out.println();
			System.out.printf("Dados da %da pessoa: \n", i + 1);
	    	System.out.print("Nome: ");
	    	nome[i] = sc.next();
	    	System.out.print("Idade: ");
	    	idade[i] = sc.nextInt();
	    	
	    }
		
	    
	    for (int i=0; i<n; i++) {
		
	    	if(idade[i] > nMaisVelho) {
	    		
	    		nMaisVelho = idade[i];
	    		posicaoMaior = i;
	    		
	    	}
	    }
	    
	    System.out.printf("\nPESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);
	    sc.close(); 
		
		System.out.println("---------------------------------------------------------------");
		
		/*
		 * 10 -> Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
				 no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
				 os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
				 igual a 6.0 (seis).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		double media;
		double sumNotas;
		
		for(int i=0; i<n; i++) {
			
			sc.nextLine();
			System.out.println();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.printf("Alunos Aprovados: ");

		for (int i=0; i<n; i++) {
			
			sumNotas = nota1[i] + nota2[i];
			media = sumNotas / 2;
			
			if (media >= 6.0) {
				
				System.out.println();
				System.out.printf("%s", nome[i]);
			
			}
			
		}
		
		sc.close(); 
		
		/*
		 * 11 -> Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
				 que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
				 de homens.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		double mediaAlturaMulheres;
		double soma = 0.0;
		int totalHomens = 0;
		int totalMulheres = 0;
		
		for (int i=0; i<n; i++) {
			
			sc.nextLine();
			System.out.println();
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
			
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		
		for (int i=1; i<n; i++) {


	    	if(altura[i] > maiorAltura) {
	    		
	    		maiorAltura = altura[i];
	    		
	    	}
	    	
	    	if (altura[i] < menorAltura) {
	    		
	    		menorAltura = altura[i];
	    	}
			
		}
		
		for(int i=0; i<n; i++) {
		
			if(genero[i] == 'M') {
				
				totalHomens++;
				
			} else if(genero[i] == 'F') {
				
				totalMulheres ++;
				soma = soma + altura[i];
			
			} 
		
		}
		
		mediaAlturaMulheres = soma / totalMulheres;
		
		System.out.println();
		System.out.printf("Menor Altura = %.2f\n", menorAltura);
		System.out.printf("Maior Altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d\n", totalHomens);
		
		sc.close();
	}
}
