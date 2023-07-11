package principal;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Circunferencia {

	
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//calculator calc = new calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circunference(radius);
		
		double v = calculator.volume(radius);
	
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calculator.PI);
		
		sc.close();

	}
	


}
