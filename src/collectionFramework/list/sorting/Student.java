package collectionFramework.list.sorting;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int sid;
	private String name;
	private int age;
	
	//No Argument constructor
	public Student() {
	}
	
	//Parameterized constructor
	public Student(int sid, String name, int age) {
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	//Getters and Setters
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, sid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && sid == other.sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}
}
