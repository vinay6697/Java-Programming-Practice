package collectionFramework.list.removeElement;

import java.util.Objects;

public class Bottle {
	
	private String brand;
	private int size;
	private String color;
	
	
	//No argument constructor
	public Bottle() {
	}

	//Parameterized constructor
	public Bottle(String brand, int size, String color) {
		this.brand = brand;
		this.size = size;
		this.color = color;
	}
	
	
	//Getters and Setters
	public String getBrand() {
		return brand;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, size);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bottle other = (Bottle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && size == other.size;
	}

	@Override
	public String toString() {
		return String.format(
		        "Bottle Brand: %-15s Size: %-5d Color: %s",
		        brand, size, color
		    );
	}
	
	
}
