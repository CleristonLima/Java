package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BussinessException;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um
		   saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
		   ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
		   saque da conta. Implemente a conta bancária conforme projeto abaixo:
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account data ");
		System.out.println();
				
		try {
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.nextLine();		
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withDrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withDrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			acc.withDrawLimit(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		
		} catch(BussinessException e) {
			
			System.out.println("Withdraw error: " + e.getMessage());
			
		}
		
		sc.close();
	}

}
