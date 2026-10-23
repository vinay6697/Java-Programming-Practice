package collectionFramework.queue.arrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		
		System.out.println("Enter the list elements");
		for(int i=0;i<6;i++)
		{
			list.add(sc.nextInt());
		}
		
		reverseList(list);
		sc.close();
	}
	public static void reverseList(List<Integer> list)
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		for(int i=0;i<list.size();i++)
		{
			ad.addFirst(list.get(i));
		}
		System.out.println(ad);
	}

}
