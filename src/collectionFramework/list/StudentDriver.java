package collectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(111,"Smith",25));
		students.add(new Student(222,"Allen",22));
		students.add(new Student(333,"Martin",23));
		students.add(new Student(444,"Clark",25));
		students.add(new Student(555,"George",24));
		
		//traversing using iterator
		System.out.println("================using Generics=========================");
		Iterator<Student> iterator=students.iterator();
		while(iterator.hasNext())
		{
			Student student=iterator.next();
			System.out.println("Student id is\t:"+student.getId());
			System.out.println("Student name is\t:"+student.getName());
			System.out.println("Student age is\t:"+student.getAge());
			System.out.println("--------------------------------------");
		}
		
		System.out.println("===============WITHOUT USING GENERICS===================");
		
		ArrayList student1=new ArrayList();
		student1.add(new Student(1,"Smith",21));
		student1.add(new Student(2,"Allen",22));
		student1.add(new Student(3,"Martin",23));
		student1.add(new Student(4,"Clark",24));
		student1.add(new Student(5,"George",25));
		

		//traversing in reverse order
		Iterator<Student> iterators=student1.iterator();
		while(iterators.hasNext())
		{
			Student student=iterators.next();
			System.out.println("Student id is\t:"+student.getId());
			System.out.println("Student name is\t:"+student.getName());
			System.out.println("Student age is\t:"+student.getAge());
			System.out.println("--------------------------------------");
		}
	}

}
