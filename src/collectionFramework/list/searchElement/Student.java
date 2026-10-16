package collectionFramework.list.searchElement;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private int age;

	//No argument constructor
	public Student() {
	}
	
	//parameterized constructor
	public Student(int id, String name, int age) {
		setId(id);
		setName(name);
		setAge(age);
	}

	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
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
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
	
}
