package entities_Cadastro;

public class Cadastro_func {
	
	public String name;
	public double salary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		
		return salary - tax;
		
	}
	
	public String toString() {
		
		return name
			   + ", "
			   + "$ "
			   + String.format("%.2f", netSalary());
	}
		
	
	public void increaseSalary(double percentage) {
		
		this.percentage += percentage;
				
	}
	
	public double updateSalary() {
		
		return salary = netSalary() + (salary / percentage);
	}

}
