package collectionFramework.set.treeSet.comparator.assignment;

import java.util.Comparator;

public class SortTaskByDeadline implements Comparator<Task>{
	@Override
	public int compare(Task x, Task y) {
		if(y.deadline!=x.deadline)
			return x.deadline-y.deadline;
		else
			return y.priority-x.priority;
	}
}
