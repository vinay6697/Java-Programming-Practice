package collectionFramework.set.treeSet.customSorting.assignment;

import java.util.Comparator;

public class SortProductsByDiscount implements Comparator<Product> {
	
	@Override
	public int compare(Product x, Product y) {
		double x1=x.discount;
		double x2=y.discount;
		if(x1!=x2)
			return y.discount.compareTo(x.discount);
		else
			return x.price-y.price;
	}
}
