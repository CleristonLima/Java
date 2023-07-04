package teste_processamento;

public class Main {

	public static void main(String[] args) {
		
			
		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Exemplo 3 -> Area do trapezio");
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		System.out.println("----------------------------------------------------");
		
		// Casting
		
		System.out.println("Exemplo 4");
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a / c;
		
		System.out.println(resultado);
		
		System.out.println("----------------------------------------------------");
		
		// Casting
		
		System.out.println("Exemplo 5");
		
		double o;
		int p;
		
		o = 5.0;
		p = (int) o;
		
		System.out.println(p);
		
	}

}
