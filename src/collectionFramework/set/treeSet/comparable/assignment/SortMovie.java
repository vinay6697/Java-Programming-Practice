package collectionFramework.set.treeSet.comparable.assignment;

import java.util.TreeSet;

public class SortMovie {
	public static void main(String[] args) {
		TreeSet<Movie> ts = new TreeSet<>();

		ts.add(new Movie("KGF 1", 2018, 9.5));
		ts.add(new Movie("Pushpa 1", 2021, 9.5));
		ts.add(new Movie("Kanthara ", 2021, 9.5));
		ts.add(new Movie("KGF 2", 2022, 9.5));
		ts.add(new Movie("RRR", 2020, 9.5));
		ts.add(new Movie("PUSHPA 2", 2024, 9.5));
		ts.add(new Movie("HIT", 2018, 9.5));
		ts.add(new Movie("HIT 2", 2018, 9.5));

		for (Movie m : ts) {
			System.out.println(m);
		}

		System.out.println("====================");

		int currentYear = -1;
		int count = 0;
		for (Movie m : ts) {
			if (m.year != currentYear) {
				if (count > 0) {
					System.out.println(currentYear + " → " + count + " movie(s)");
				}
				currentYear = m.year;
				count = 1;
			} else {
				count++;
			}
		}

		// Print the last group
		if (count > 0) {
			System.out.println(currentYear + " → " + count + " movie(s)");
		}
	}
}
