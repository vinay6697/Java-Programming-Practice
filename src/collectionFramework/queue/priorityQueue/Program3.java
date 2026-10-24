package collectionFramework.queue.priorityQueue;

import java.util.PriorityQueue;

public class Program3 {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("apple");
		pq.add("orange");
		pq.add("grapes");
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}
}
