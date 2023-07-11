package util;

public class CurrentConventer {
	
	public static final double IOF = 1.06;
	
	/*public static double dolarComprado (double dolarBought) {
		return dolarBought;
		
	}

	public static double dolarPreco (double dolarPrice) {
		return dolarPrice * IOF;
		
	}*/
	
	public static double reais (double dolarBought, double dolarPrice) {
		return dolarPrice * dolarBought * IOF;
		
	}
}
