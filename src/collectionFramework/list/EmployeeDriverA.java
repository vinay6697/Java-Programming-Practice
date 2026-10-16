package collectionFramework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeDriverA {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"Smith",50000.25));
		employees.add(new Employee(2,"Allen",27580.78));
		employees.add(new Employee(3,"Martin",39354.63));
		employees.add(new Employee(4,"George",21574.94));
		employees.add(new Employee(5,"Clark",45214.18));
		
		System.out.println("===========In Reverse Order=================");
		
		ListIterator<Employee> iterator =employees.listIterator(employees.size());
		while(iterator.hasPrevious())
		{
			Employee employee=iterator.previous();
			System.out.println("Employee Name is: "+employee.getName());
		}
		
		System.out.println("===========Name and Salary=================");
		
	}
}
