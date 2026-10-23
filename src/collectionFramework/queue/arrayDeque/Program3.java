package collectionFramework.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque<Character> ad=new ArrayDeque<>();
		System.out.println("Enter the size of the elements to be added");
		int size=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<size;i++)
		{
			ad.offerFirst(sc.next().charAt(0));
//			i++;
//			ad.offerLast(sc.next().charAt(0));
		}
		
		System.out.println(ad);
		sc.close();
	}

}
