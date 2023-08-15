package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		 * 	Fazer um programa para ler os dados de N
		  	produtos (N fornecido pelo usuário). Ao final,
			mostrar a etiqueta de preço de cada produto na
			mesma ordem em que foram digitados.
			Todo produto possui nome e preço. Produtos
			importados possuem uma taxa de alfândega, e
			produtos usados possuem data de fabricação.
			Estes dados específicos devem ser
			acrescentados na etiqueta de preço conforme
			exemplo (próxima página). Para produtos
			importados, a taxa e alfândega deve ser
			acrescentada ao preço final do produto.
			Favor implementar o programa conforme
			projeto ao lado.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number od products: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		List<Product> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
				if(ch == 'c') {
						
					list.add(new Product(name, price));

				
				} else if (ch == 'u') {
						
					System.out.print("Manufacture date : ");				
					LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					
					 list.add(new UsedProduct(name, price, manufactureDate));
		
				    
				} else if (ch == 'i') {

					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					sc.nextLine();
					
					list.add(new ImportedProduct(name, price, customsFee));

					
					}
				
				}
		
				System.out.println();
				System.out.println("PRICE TAGS: ");
				for (Product prod : list) {
					System.out.println(prod.priceTag());
				
				sc.close();

				}
			}
		}

