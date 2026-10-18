package collectionFramework.list.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortStudentByAttribute {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> students=new LinkedList<>();
		students.add(new Student(1,"Vikas",20));
		students.add(new Student(2,"Dixit",21));
		students.add(new Student(3,"Shradda",20));
		students.add(new Student(4,"Jenny",23));
		students.add(new Student(5,"Navin",22));
		
		System.out.println("Enter the choice for sorting based on attribute");
		System.out.println("Enter 1 to sort based on age");
		System.out.println("Enter 2 to sort based on name");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				Collections.sort(students,new SortStudentByAge());
				for(Student student:students)
				{
					System.out.println(student);
				}
				break;
			}
			case 2:
			{
				Collections.sort(students,new SortStudentByName());
				for(Student student:students)
				{
					System.out.println(student);
				}
				break;
			}
			default:
			{
				break;
			}
		}//end of switch
		sc.close();
		
	}
}
