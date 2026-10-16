package collectionFramework.list.searchElement;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchObjectById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(111,"Smith",25));
		students.add(new Student(222,"Allen",22));
		students.add(new Student(333,"Martin",23));
		students.add(new Student(444,"Clark",25));
		students.add(new Student(555,"George",24));
		
		System.out.println("Enter the Student id");
		int id=sc.nextInt();
		
		boolean found=false;
		for(Student student:students)
		{
			if(student.getId()==id)
			{
				found=true;
				System.out.println("Student exists");
				System.out.println(student);
				break;
			}
		}
		if(found==false)
			System.out.println("Student with id "+id+" no found");
		
		sc.close();
	}
}
