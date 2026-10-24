package collectionFramework.queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskDriver {
	public static void main(String[] args) {
		
		Comparator<Task> comp=(Task x,Task y)->Integer.compare(x.priority, y.priority);
		PriorityQueue<Task> pq=new PriorityQueue<Task>(comp);
		
		Task t1=new Task("walking",5);
		Task t2=new Task("Eating",3);
		Task t3=new Task("Working",5);
		Task t4=new Task("Meeting",1);
		Task t5=new Task("Cardio",2);
		
		pq.add(t1);
		pq.add(t2);
		pq.add(t3);
		pq.add(t4);
		pq.add(t5);
		
		for(Task task:pq)
		{
			System.out.println(task);
		}
	}
}
