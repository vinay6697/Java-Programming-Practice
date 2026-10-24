package collectionFramework.queue.priorityQueue;

import java.util.PriorityQueue;

public class Program9 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		pq.add(40);
		pq.add(60);
		pq.add(5);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
	}
}
