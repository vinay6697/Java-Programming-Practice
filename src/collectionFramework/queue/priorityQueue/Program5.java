package collectionFramework.queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		Comparator<Integer> comp = (a, b) ->Integer.compare(b,a);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(comp);
		for (int i = 0; i < size; i++) {
			pq.add(sc.nextInt());
		}

		for (int i : pq) {
			System.out.println(i);
		}
		sc.close();
	}
}
