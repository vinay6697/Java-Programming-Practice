package collectionFramework.set.treeSet.customSorting;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("Enter 1 to sort based on id");
		System.out.println("Enter 2 to sort based on name");
		System.out.println("Enter 3 to sort based on salary");
		
		int choice=sc.nextInt();
		
		TreeSet<Employee> employees=null;
		
		switch(choice)
		{
			case 1:
			{
				employees=new TreeSet<Employee>(new SortEmployeeById());
				break;
			}
			case 2:
			{
				employees=new TreeSet<Employee>(new SortEmployeeByName());
				break;
			}
			case 3:
			{
				employees=new TreeSet<Employee>(new SortEmployeeById());
				break;
			}
			default:
			{
				//sorting by id if choice given is invalid
				employees=new TreeSet<Employee>(new SortEmployeeById());
				System.out.println("Invalid choice");
				break;
			}
		}
		Employee e1=new Employee(104,"Barry",25651.36);
		Employee e2=new Employee(101,"Dustin",35475.84);
		Employee e3=new Employee(103,"Allen",96547.92);
		Employee e4=new Employee(102,"Cherry",36542.42);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		
		sc.close();
	}

}
