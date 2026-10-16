package collectionFramework.listAssignment1;

public class Student {
	
	private String name;
	private int classNo;
	private int marks;
	
	
	//no argument constructor
	public Student() {
		
	}
	
	//parameterized constructor
	public Student(String name, int classNo, int marks) {
		this.name = name;
		this.classNo = classNo;
		this.marks = marks;
	}
	//Getters and setters
	public String getName() {
		return name;
	}
	public int getClassNo() {
		return classNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Name is:"+name+" \t classNo is: "+classNo+" \t marks is: "+marks;
	}
}
