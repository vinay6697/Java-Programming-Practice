package collectionFramework.queue.priorityQueue;

import java.util.PriorityQueue;

public class Program7 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(50);
		pq.add(20);
		pq.add(70);
		pq.add(10);
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}
}
