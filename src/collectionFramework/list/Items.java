package collectionFramework.list;

public class Items {
	private int itemId;
	private String name;
	private double cost;
	private double rating;
	
	//No argument constructor
	public Items() {
	}
	//parameterized constructor
	public Items(int itemId, String name, double cost, double rating) {
		this.itemId = itemId;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}
	//Getters and Setters
	public int getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
	public double getRating() {
		return rating;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
}
