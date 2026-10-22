package collectionFramework.set.treeSet.defaultSorting.assignment;

public class Bottle implements Comparable<Bottle> {
	String brand;
	int capacity;

	Bottle(String brand, int capacity) {
		this.brand = brand;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return brand + " " + capacity;
	}

	@Override
	public int compareTo(Bottle b)
	{
		if(this.brand.compareTo(b.brand)==0)
			return this.capacity-b.capacity;
		else
			return this.brand.compareTo(b.brand);
			
	}
//	@Override
//	public int compareTo(Bottle b) {
//		if (this.capacity != b.capacity)
//			return this.capacity-b.capacity;
//		else
//			return this.brand.compareTo(b.brand);
//	}
}
