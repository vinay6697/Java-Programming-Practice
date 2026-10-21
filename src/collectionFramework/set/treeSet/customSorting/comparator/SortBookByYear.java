package collectionFramework.set.treeSet.customSorting.comparator;

import java.util.Comparator;

public class SortBookByYear implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		if(b1.year!=b2.year)
			return b1.year-b2.year;
		else if(!(b1.rating.equals(b2.rating)))
			return b1.rating.compareTo(b2.rating);
		else
			return b1.title.compareTo(b2.title);
	}
}
