package collectionFramework.set.treeSet.comparator.assignment;

import java.util.TreeSet;

public class SortDriver {
	public static void main(String[] args) {
		Task t1 = new Task(40, 4, "Collection Frameworks");
		Task t2 = new Task(30, 2, "Object Oriented");
		Task t3 = new Task(10, 1, "Basics");
		Task t4 = new Task(40, 3, "MultiThreading");
		Task t5 = new Task(60, 5, "J2EE");

		SortTaskByDeadline stbd = new SortTaskByDeadline();
		TreeSet<Task> ts = new TreeSet<>(stbd);
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		ts.add(t5);

		for (Task t : ts) {
			System.out.println(t);
		}
	}
}
