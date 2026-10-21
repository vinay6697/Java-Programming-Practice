package collectionFramework.set.treeSet.treeset_assignment;

import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		
		Student s1=new Student(111,"Akash",5);
		Student s2=new Student(333,"Ramesh",6);
		Student s3=new Student(555,"Rakeeb",6);
		Student s4=new Student(444,"Kiran",5);
		Student s5=new Student(222,"Harishit",5);
		
		TreeSet<Student> ts=new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for(Student s:ts)
		{
			System.out.println(s);
		}
	}

}
