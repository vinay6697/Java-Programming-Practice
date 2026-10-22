package collectionFramework.set.treeSet.comparable.assignment;

public class Pen implements Comparable<Pen>{
	String brand;
	double price;
	
	
	public Pen(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public int compareTo(Pen p) {
		if(this.price!=p.price)
			return Double.compare(this.price, p.price);
		else
			return this.brand.compareTo(p.brand);
	}
	
	@Override
	public String toString()
	{
		return brand+" "+price;
	}

}
