package temporada_03;

import java.util.Scanner;

class ExerciciosPropostos {

	public static void main(String[] args) {
		
		/*
		 * 01 -> Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem Explicativa
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*int x, y;
		int soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();*/
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*
		 * 02 -> Faça um programa para ler o valor do raio de um circulo, e depois mostrar o valor da area deste circulo com quatro casas decimais conforme exemplos:
		 * 
		 * Formula da area: area = pi.raio2
		 * 
		 * Considere o valor de pi = 3.14
		 */
		
		/*double valorRaio;
        double pi = 3.14159;
        double A;
        double totalRaio;
        double area;
        
        System.out.print("Digite o valor do raio: ");
        valorRaio = sc.nextDouble();
        
        A = Math.pow(valorRaio, 2.0);
        
        totalRaio = A;
        
        area = totalRaio * pi;
        
        System.out.printf("A Area do circulo é = %.4f%n ", area);*/
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*
		 * 03 -> Faça um programa para ler quatro valores A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a formula: DIFERENCA = (A * B - C * D).
		 * 
		 */
		
		/*int A, B, C, D;
		int diferenca;
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();
		
		System.out.print("Digite o valor de D: ");
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("A diferença é de: " + diferenca);*/
		
		/*
		 * 04 -> Fazer um programa que leia o numero de um funcionario, seu numero de horas trabalhadas, o valor que recebe por hora e calcula o salario desse funcionario
		 * A seguir, mostre o numero e o salario do funcionario, com duas casas decimais.
		 * 
		 */
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*int number_func;
		double valor, hora_trab, salary;
		
		System.out.print("Digite o numero do funcionario: ");
		number_func = sc.nextInt();
		
		System.out.print("Digite as horas trabalhadas:  ");
		hora_trab = sc.nextDouble();
		
		System.out.print("Digite o valor combinado: ");
		valor = sc.nextDouble();
		
		salary = hora_trab * valor;
		
		System.out.println("NUMBER = " + number_func);
		
		System.out.printf("SALARY = %.2f%n ", salary);*/
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*
		 * 05 -> Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
				 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		/*int codigo_pc1, codigo_pc2;
		double qty1, preco1, total1, qty2, preco2, total2, total_pagar;
		
		System.out.print("Digite o código da peca 1: ");
		codigo_pc1 = sc.nextInt();
		
		System.out.print("Digite a quantidade referente a peca 1: ");
		qty1 = sc.nextDouble();
		
		System.out.print("Digite o preco da peca 1: ");
		preco1 = sc.nextDouble();
		
		total1 = preco1 * qty1;
		
		System.out.print("Digite o código da peca 2: ");
		codigo_pc2 = sc.nextInt();
		
		System.out.print("Digite a quantidade referente a peca 2: ");
		qty2 = sc.nextDouble();
		
		System.out.print("Digite o preco da peca 2: ");
		preco2 = sc.nextDouble();
		
		total2 = preco2 * qty2;
		
		total_pagar = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", total_pagar);*/
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/*
		 * 06 -> Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
				 mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.
		 */
		
		double A, B, C, total_raio;
		double pi = 3.14159;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		B = sc.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		C = sc.nextDouble();
		
		System.out.println();
		
		triangulo = (A * C) / 2;
		
		System.out.printf("TRIANGULO: %.3f%n ", triangulo);
		
		System.out.println();
		
		total_raio = Math.pow(C, 2.0);
		
		circulo = total_raio * pi;
		
		System.out.printf("CIRCULO: %.3f%n ", circulo);
		
		System.out.println();
		
		trapezio = (A + B) * C / 2;
		
		System.out.printf("TRAPEZIO: %.3f%n ", trapezio);
		
		System.out.println();
		
		quadrado = B * B;
		
		System.out.printf("QUADRADO: %.3f%n ", quadrado);
		
		System.out.println();
		
		retangulo = A * B;
		
		System.out.printf("RETANGULO: %.3f%n ", retangulo);
		
		sc.close();
	}

}
