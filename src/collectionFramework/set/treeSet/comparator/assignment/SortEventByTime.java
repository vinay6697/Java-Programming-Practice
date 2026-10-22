package collectionFramework.set.treeSet.comparator.assignment;

import java.util.Comparator;

public class SortEventByTime implements Comparator<Event>{
	@Override
	public int compare(Event x, Event y) {
		int duration1=x.endTime-x.startTime;
		int duration2=y.endTime-y.startTime;
		if(duration1!=duration2)
			return duration1-duration2;
		else
			return x.title.compareTo(y.title);
	}

}
