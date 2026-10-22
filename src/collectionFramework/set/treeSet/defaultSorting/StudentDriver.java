package collectionFramework.set.treeSet.defaultSorting;

import java.util.TreeSet;

public class StudentDriver {
	public static void main(String[] args) {
		
		TreeSet<Student> students=new TreeSet<>();
		students.add(new Student(103,"BANNER"));
		students.add(new Student(101,"ANNET"));
		students.add(new Student(102,"CHARLIE"));
		
		for(Student student:students)
		{
			System.out.println(student);
		}
	}
}
