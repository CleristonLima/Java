package entities;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	// o = Other
	public int compareTo(Employee o) {
		// Ordernando por nome
		//return name.compareTo(o.getName());
		
		// Ordenando por salario em ordem crescente
		//return salary.compareTo(o.getSalary());
		
		// Ordenando por salario em ordem decrescente
		return -salary.compareTo(o.getSalary());
	}
	
	

}
