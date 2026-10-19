package collectionFramework.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CommonElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 elements into the first linkedhashset");
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		lhs1.add(sc.nextInt());
		lhs1.add(sc.nextInt());
		lhs1.add(sc.nextInt());
		lhs1.add(sc.nextInt());
		lhs1.add(sc.nextInt());
		
		System.out.println("Enter the 5 elements into the second linkedhashset");
		LinkedHashSet<Integer> lhs2=new LinkedHashSet<Integer>();
		lhs2.add(sc.nextInt());
		lhs2.add(sc.nextInt());
		lhs2.add(sc.nextInt());
		lhs2.add(sc.nextInt());
		lhs2.add(sc.nextInt());
		
		LinkedHashSet<Integer> commonElements=findCommonElements(lhs1,lhs2);
		if(!commonElements.isEmpty())
			System.out.println(commonElements);
		else
			System.out.println("no common elements found");
		sc.close();
	}
	
	public static LinkedHashSet<Integer> findCommonElements(LinkedHashSet<Integer> lhs1,LinkedHashSet<Integer> lhs2)
	{
		if(lhs1.isEmpty() || lhs2.isEmpty())
			return new LinkedHashSet<Integer>();
		else
		{
			LinkedHashSet<Integer> commonElements=new LinkedHashSet<Integer>(); 
			for(Integer element:lhs1)
			{
				if(lhs2.contains(element))
					commonElements.add(element);
			}
		return commonElements;
		}
	}
}
