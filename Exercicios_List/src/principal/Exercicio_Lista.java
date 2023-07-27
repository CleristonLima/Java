package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Entidades;

public class Exercicio_Lista {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
		   N funcionários. Não deve haver repetição de id.
		   Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
		   Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
		   mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
		   conforme exemplos.
		   Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
		   ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
		   aumento por porcentagem dada.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Entidades> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i + ":");
			sc.nextLine();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
				while (hasId(list, id)) {
						System.out.print("Id already taken: Try again: ");
						id = sc.nextInt();
						sc.nextLine();
					}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Entidades(id, name, salary));
			
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Entidades ent = list.stream().filter(x -> x.getid() == id).findFirst().orElse(null);
		
			if(ent == null) {
			
				System.out.println("this id does not exist! ");
			
			} else {
				
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				ent.increaseSalary(percent);
				
			}
			
			System.out.println();
			System.out.println("List of employees: ");
			
			for(Entidades obj: list) {
				
				System.out.println(obj);
			}
			
		sc.close();

	}

	private static boolean hasId(List<Entidades> list, int id) {
		
		Entidades ent = list.stream().filter(x -> x.getid() == id).findFirst().orElse(null);
		return ent != null;
	}

}
