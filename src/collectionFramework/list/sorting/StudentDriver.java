package collectionFramework.list.sorting;

import java.util.Collections;
import java.util.LinkedList;

public class StudentDriver {
	public static void main(String[] args) {
		LinkedList<Student> students=new LinkedList<>();
		students.add(new Student(1,"Vikas",20));
		students.add(new Student(2,"Dixit",21));
		students.add(new Student(3,"Shradda",20));
		students.add(new Student(4,"Jenny",22));
		students.add(new Student(5,"Navin",23));
		
		System.out.println("---------- before sorting ----------");
		for(Student student:students)
		{
			System.out.println(student);
		}
		 
		Collections.sort(students);
		
		System.out.println("---------- After sorting ----------");

		for(Student student:students)
		{
			System.out.println(student);
		}
	}
}
