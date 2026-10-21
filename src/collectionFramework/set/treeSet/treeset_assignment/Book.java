package collectionFramework.set.treeSet.treeset_assignment;

public class Book implements Comparable<Book> {
	String title;
	String author;
	int pages;

	Book(int pages,String title, String author) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

//	@Override
//	public int compareTo(Book b) {
//		return this.title.compareTo(b.title);
//	}
	
	@Override
	public int compareTo(Book b) {
		return this.author.compareTo(b.author);
	}

	@Override
	public String toString() {
		return pages + " " + title+" \t\t"+author  ;
	}

}
