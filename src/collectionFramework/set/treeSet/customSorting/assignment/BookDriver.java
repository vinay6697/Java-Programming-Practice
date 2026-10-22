package collectionFramework.set.treeSet.customSorting.assignment;

import java.util.TreeSet;

public class BookDriver {
	public static void main(String[] args) {
		Book b1 = new Book("Titanic   ", 1995, 4.6);
		Book b2 = new Book("Inception", 2010, 4.8);
		Book b3 = new Book("Interstellar", 2014, 4.7);
		Book b4 = new Book("Godfather", 1972, 4.9);
		Book b5 = new Book("The Matrix", 1995, 4.6);

		SortBookByYear sbby = new SortBookByYear();
		TreeSet<Book> ts = new TreeSet<>(sbby);
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);

		for (Book b : ts) {
			System.out.println(b);
		}
	}
}
