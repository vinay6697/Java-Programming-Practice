package collectionFramework.set.treeSet.customSorting;

import java.util.Scanner;
import java.util.TreeSet;

public class StudentDriver {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Sort by Name");
		System.out.println("2. Sort by Age");
		System.out.print("Enter your choice: ");

		int choice = sc.nextInt();
		
		StudentService service=new StudentService();
		TreeSet<Student> ts=service.createStudentSet(choice);
		
		Student s1=new Student(24,"Barry");
		Student s2=new Student(21,"Cherry");
		Student s3=new Student(23,"Allen");
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student student:ts)
		{
			System.out.println(student);
		}
		sc.close();
	}

}
