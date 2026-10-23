package collectionFramework.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the elements");
		int size=sc.nextInt();
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		for(int i=0;i<size;i++)
		{
			ad.addFirst(sc.nextInt());
		}
		
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
		System.out.println("------------------------------");
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		sc.close();
	}

}
