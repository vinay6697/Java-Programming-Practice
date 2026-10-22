package collectionFramework.set.treeSet.comparable;

import java.util.TreeSet;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee(2,"John",12.68);
		Employee e2=new Employee(1,"Allen",45.87);
		
		TreeSet<Employee> employees=new TreeSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(new Employee(4,"Tom",63.78));
		employees.add(new Employee(3,"George",97.34));
		
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
	}

}
