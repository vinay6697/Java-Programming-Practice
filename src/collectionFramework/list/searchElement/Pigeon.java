package collectionFramework.list.searchElement;

import java.util.Objects;

public class Pigeon {
	private String breed;
	private int age;
	
	//No argument constructor
	public Pigeon() {
	}
	
	//parameterized constructor
	public Pigeon(String breed, int age) {
		this.breed = breed;
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, breed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pigeon other = (Pigeon) obj;
		return age == other.age && Objects.equals(breed, other.breed);
	}

	@Override
	public String toString() {
		return "Pigeon [breed=" + breed + ", age=" + age + "]";
	}
	
}
