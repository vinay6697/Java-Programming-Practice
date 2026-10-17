package collectionFramework.list.removeElement;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Employee> employees=new LinkedList<>();
		employees.add(new Employee(1,"Smith",50000.25));
		employees.add(new Employee(2,"Allen",27580.78));
		employees.add(new Employee(3,"Martin",39354.63));
		employees.add(new Employee(4,"George",21574.94));
		employees.add(new Employee(5,"Clark",45214.18));
		
		System.out.println("----------------before removing------------------");

		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		
		Employee removeEmployee=new Employee(id,name,salary);
		
		if(employees.contains(removeEmployee))
		{
			employees.remove(removeEmployee);
			System.out.println("Employee object removed successfully");
		}
		else
		{
			System.out.println("Employee not found");
		}
		
		System.out.println("----------------After removing------------------");
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		sc.close();
	}
}
