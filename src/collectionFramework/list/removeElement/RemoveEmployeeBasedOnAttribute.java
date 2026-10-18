package collectionFramework.list.removeElement;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveEmployeeBasedOnAttribute {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Employee> employees=new LinkedList<>();
		employees.add(new Employee(111,"Rahul",25000.00));
		employees.add(new Employee(222,"Arpit",45000.00));
		employees.add(new Employee(333,"Priya",27000.00));
		employees.add(new Employee(444,"Manasa",50000.00));
		employees.add(new Employee(555,"Vinod",55000.00));
		employees.add(new Employee(666,"Virajitha",35000.00));
		
		System.out.println("======= before removing =========");
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		
		//using for loop
		/* here i am making use of break keyword which avoid ConcurrentModificationException*/
		boolean removed=false;
		for(Employee employee:employees)
		{
			if(employee.getId()==id)
			{
				employees.remove(employee);
				System.out.println("Employee removed successfully");
				removed=true;
				break;
			}
		}
		if(removed==false)
			System.out.println("Employee Id not found");
		
		System.out.println("======= After removing =========");
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		
		
		removeByUsingIterator(employees,id);
		sc.close();
		
	}
	
	public static void removeByUsingIterator(LinkedList<Employee> employees,int id)
	{
		Employee employeeToBeRemoved=null;
		boolean removed=false;
		Iterator<Employee> iterator=employees.iterator();
		while(iterator.hasNext())
		{
			employeeToBeRemoved=iterator.next();
			if(employeeToBeRemoved.getId()==id)
			{
				iterator.remove();
				/* here i am making use of remove( ) from iterator
				 * and not from the LinkedList
				 * which avoid ConcurrentModificationException*/
				removed=true;
				System.out.println("Employee Removed successfully");
			}
		}
		if(removed==false)
			System.out.println("Employee id not found");
	}
}
