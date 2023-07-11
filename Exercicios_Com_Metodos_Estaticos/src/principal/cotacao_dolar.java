package principal;

import java.util.Locale;
import java.util.Scanner;

import util.CurrentConventer;

public class cotacao_dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price? ");
		double dolarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dolarBought = sc.nextDouble();
		

		System.out.printf("Amount to be paid in reais = %.2f%n", CurrentConventer.reais(dolarBought, dolarPrice));
		
		
		sc.close();

	}

}
