package collectionFramework.list.removeElement;

import java.util.Objects;

public class Shoe {
	private int pid;
	private double price;
	private String color;
	
	//No argument Constructor
	public Shoe() {
	}
	
	//Parameterized Constructor
	public Shoe(int pid, double price, String color) {
		this.pid = pid;
		this.price = price;
		this.color = color;
	}
	
	//Generate Getters and Setters
	public int getPid() {
		return pid;
	}
	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shoe [pid=" + pid + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, pid, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		return Objects.equals(color, other.color) && pid == other.pid
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
