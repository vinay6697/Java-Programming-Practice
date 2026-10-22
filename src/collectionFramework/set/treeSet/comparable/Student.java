package collectionFramework.set.treeSet.comparable;

public class Student implements Comparable<Student>{
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id+" "+name;
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}
	
}
