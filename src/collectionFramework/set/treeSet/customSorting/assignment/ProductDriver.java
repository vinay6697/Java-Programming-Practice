package collectionFramework.set.treeSet.customSorting.assignment;

import java.util.TreeSet;

public class ProductDriver {
	public static void main(String[] args) {
		Product p1 = new Product(111, "Phone", 40000, 16.93);
		Product p2 = new Product(333, "Laptop", 60000, 16.93);
		Product p3 = new Product(222, "Earphone", 1000, 10.39);
		Product p4 = new Product(444, "SmartTV", 50000, 30.00);
		Product p5 = new Product(555, "Speakers", 10000, 15.3);

		SortProductsByDiscount spbd = new SortProductsByDiscount();

		TreeSet<Product> ts = new TreeSet<Product>(spbd);
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);

		for (Product p : ts) {
			System.out.println(p);
		}
	}
}
