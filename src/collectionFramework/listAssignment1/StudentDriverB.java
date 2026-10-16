package collectionFramework.listAssignment1;

import java.util.ArrayList;

public class StudentDriverB {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("Smith",10,64));
		students.add(new Student("Allen",11,95));
		students.add(new Student("Martin",10,97));
		students.add(new Student("George",10,35));
		students.add(new Student("Clark",11,91));
		
		for(int i=0;i<students.size();i++)
		{
			if(students.get(i).getName().length()>5)
				System.out.println(students.get(i));
		}
	}
}
