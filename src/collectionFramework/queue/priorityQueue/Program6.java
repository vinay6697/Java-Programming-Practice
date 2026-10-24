package collectionFramework.queue.priorityQueue;

import java.util.PriorityQueue;

public class Program6 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(15);
		pq.add(5);
		pq.add(30);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
