package collectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDriverB {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"Smith",50000.25));
		employees.add(new Employee(2,"Allen",27580.78));
		employees.add(new Employee(3,"Clark",39354.63));
		
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
		{
			Employee employee=iterator.next();
			System.out.println("Name is: "+employee.getName()+"|\t salary is:"+employee.getSalary());
		}
	}
}
