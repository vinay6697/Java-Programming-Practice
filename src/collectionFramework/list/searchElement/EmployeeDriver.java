package collectionFramework.list.searchElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"Smith",25));
		employees.add(new Employee(2,"Allen",27));
		employees.add(new Employee(3,"Martin",39));
		employees.add(new Employee(4,"George",21));
		employees.add(new Employee(5,"Clark",45));
		
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		
		boolean found=false;
		
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
		{
			Employee employee=iterator.next();
			if(employee.getId()==id)
			{
				found=true;
				System.out.println("Employee found");
				System.out.println(employee);
				break;
			}
		}
		if(found==false)
			System.out.println("Employee not found");
		
		sc.close();
	}
}
