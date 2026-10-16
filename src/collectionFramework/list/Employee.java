package collectionFramework.list;

public class Employee {
	
	private int id;
	private String name;
	private double salary;

	//No argument constructor
	public Employee() {
	}
	
	// parameterized constructor
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//Generate Getters and Setters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
