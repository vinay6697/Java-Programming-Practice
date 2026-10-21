package collectionFramework.set.treeSet.customSorting.comparator;

public class Event {
	String title;
	int startTime;
	int endTime;
	
	Event(String title,int startTime,int endTime)
	{
		this.title=title;
		this.startTime=startTime;
		this.endTime=endTime;
	}
	
	@Override
	public String toString()
	{
		return title+"\t\t"+(endTime-startTime);
	}

}
