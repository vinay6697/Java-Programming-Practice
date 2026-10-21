package collectionFramework.set.treeSet.customSorting.comparator;

import java.util.TreeSet;

public class EventDriver {
	public static void main(String[] args) {
		Event e1 = new Event("Meeting", 9, 11);
		Event e2 = new Event("Lunch", 12, 13);
		Event e3 = new Event("Workout", 18, 20);
		Event e4 = new Event("Call", 15, 16);
		Event e5 = new Event("Coffee", 11, 11);

		SortEventByTime sebt=new SortEventByTime();
		TreeSet<Event> ts=new TreeSet<>(sebt);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		for(Event e:ts)
		{
			System.out.println(e);
		}
	}


}
