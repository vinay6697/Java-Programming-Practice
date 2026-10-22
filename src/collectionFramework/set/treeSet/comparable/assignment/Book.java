package collectionFramework.set.treeSet.comparable.assignment;

public class Book implements Comparable<Book> {
	String title;
	String author;
	int pages;

	Book(int pages,String title, String author) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	@Override
	public int compareTo(Book b) {
			return this.pages-b.pages;
	}

	@Override
	public String toString() {
		return pages + " " + title+" \t\t"+author  ;
	}

}
