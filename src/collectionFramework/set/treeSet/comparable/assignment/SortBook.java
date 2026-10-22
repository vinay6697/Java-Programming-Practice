package collectionFramework.set.treeSet.comparable.assignment;

import java.util.TreeSet;

public class SortBook {
	public static void main(String[] args) {
		Book b1=new Book(200,"HarryPotter","J.k Rowling");
		Book b2=new Book(350,"Java","James Gowsling");
		Book b3=new Book(400,"Titanic","Elizabeth Farr");
		Book b4=new Book(150,"Atomic Habits","James Clear");
		Book b5=new Book(250,"Rich dad Poor dad"," Robert T");
		
		TreeSet<Book> ts=new TreeSet<>();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		for(Book b:ts)
		{
			System.out.println(b);
		}
	}
}
