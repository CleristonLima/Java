package entities;

public class Entidades {

	private int id;
	private String name;
	private double salary;
	
	public Entidades() {
		
	}
	
	public Entidades(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percent) {
		
		salary += salary * percent /100.0; 
	}

	@Override
	public String toString() {
		return id 
			   + ", " 
			   + name 
			   + ", " 
			   + String.format("%.2f", salary);
	}
	
	
}
