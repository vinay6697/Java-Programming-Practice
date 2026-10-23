package collectionFramework.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements to be added");
		int size=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<size;i++)
		{
			ad.addFirst(sc.nextLine());
			ad.addLast(sc.nextLine());
			i++;
		}
		
		System.out.println(ad);
		sc.close();
	}

}
