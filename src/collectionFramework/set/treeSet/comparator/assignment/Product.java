package collectionFramework.set.treeSet.comparator.assignment;

public class Product {
	int id;
	String name;
	int price;
	Double discount;

	Product(int id, String name, int price, double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return id + " " + name + "\t" + price + "\t" + discount;
	}
}
