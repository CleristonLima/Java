package temp_09_Exercicios_com_atributos;

import java.util.Locale;
import java.util.Scanner;

import entities_Cadastro.Cadastro_func;
import entities_Student.Student;
import entities_rectangule.Rectangule_area;

public class Exercicos_com_atributos_01 {

	public static void main(String[] args) {
		
		/* 1 -> Fazer um programa para ler os valores da largura e altura
				de um retângulo. Em seguida, mostrar na tela o valor de
				sua área, perímetro e diagonal. Usar uma classe como
				mostrado no projeto ao lado.
		 */
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangule_area retangulo = new Rectangule_area();
		
		System.out.println("Enter rectagule width and height: ");
		System.out.println("Width: ");
		retangulo.width = sc.nextDouble();
		
		System.out.println("Height: ");
		retangulo.height = sc.nextDouble();
		
		double area = retangulo.areaRectangular();
		double perimetro = retangulo.perimeterRectangular();
		double diagonal = retangulo.diagonalRectagular();
		
		System.out.printf("AREA = %.2f ", area);
		System.out.printf(" PERIMETRO = %.2f ", perimetro);
		System.out.printf(" DIAGONAL = %.2f ", diagonal);

		sc.close();*/
		
		System.out.println("---------------------------------------------------------------------------------");
		
		/* 2 -> Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
				seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
				salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
				afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
				projetada abaixo. */
		
		/* Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cadastro_func cadastro = new Cadastro_func();
		
		System.out.println("Employee: ");
		cadastro.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		cadastro.salary = sc.nextDouble();
		
		System.out.println("Tax: ");
		cadastro.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + cadastro);
		
		System.out.println();
		System.out.print("Which  percentagem to increase salary? ");
		double percentage = sc.nextDouble();
		cadastro.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated Data: " + cadastro.name + ", " + cadastro.updateSalary());
		
		sc.close();*/
		
		System.out.println("---------------------------------------------------------------------------------");
		
		 /* 3 -> Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
		resolver este problema. */

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do Aluno: ");
		student.name = sc.nextLine();
		
		System.out.println("Digite a primeira nota do trimestre: ");
		student.n1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do trimestre: ");
		student.n2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota do trimestre: ");
		student.n3 = sc.nextDouble();
		
		
			if(student.n1 > 30) {
			
				System.out.println("Nota incorreta");
				System.out.println("Digite a primeira nota do trimestre: ");
				student.n1 = sc.nextDouble();
			
			} else if (student.n2 > 35) {
			
				System.out.println("Nota incorreta");
				System.out.println("Digite a segunda nota do trimestre: ");
				student.n2 = sc.nextDouble();
			
			} else if (student.n3 > 35) {
				
				System.out.println("Nota incorreta");
				System.out.println("Digite a terceira nota do trimestre: ");
				student.n3 = sc.nextDouble();
			}
			
			System.out.println();
			System.out.printf("FINAL GRADE =  %.2f", student.finalGrade());
			
			if (student.finalGrade() >= 60) {
				
				System.out.println();
				System.out.println("PASS");
				
			} else {
				
				System.out.println("FAILED");
				
				System.out.println("MISSING " + student.finalGradeFailed() + " POINTS");
				
			}
		
		sc.close();
	}

}
