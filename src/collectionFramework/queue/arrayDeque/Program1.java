package collectionFramework.queue.arrayDeque;

import java.util.ArrayDeque;

public class Program1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addLast(1);
		ad.addLast(2);
		ad.addLast(3);
		ad.addLast(4);
		ad.addLast(5);
		
		for(int i:ad)
		{
			System.out.println(i);
		}
	}
}
