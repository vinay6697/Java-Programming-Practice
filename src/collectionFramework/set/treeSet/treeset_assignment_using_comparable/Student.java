package collectionFramework.set.treeSet.treeset_assignment;

public class Student implements Comparable<Student>{
	String name;
	int rollNo;
	int grade;
	
	
	Student(int rollNo,String name,int grade)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.grade=grade;
	}
	
	public String toString()
	{
		return rollNo+" "+name+" "+grade;
	}

	@Override
	public int compareTo(Student s) {
		return this.rollNo-s.rollNo;
	}

}
