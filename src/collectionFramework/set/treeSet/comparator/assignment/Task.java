package collectionFramework.set.treeSet.comparator.assignment;

public class Task {
	String name;
	int deadline;
	int priority;
	
	Task(int deadline,int priority,String name)
	{
		this.deadline=deadline;
		this.priority=priority;
		this.name=name;
	}
	
	public String toString()
	{
		return deadline+" "+priority+" "+name;
	}


}
