package collectionFramework.set.treeSet.comparator.assignment;

public class Book {
		String title;
		int year;
		Double rating;

		Book(String title, int year, Double rating) {
			this.title = title;
			this.year = year;
			this.rating = rating;
		}

		@Override
		public String toString() {
			return title + "\t" + year + "\t" + rating;
		}
}
