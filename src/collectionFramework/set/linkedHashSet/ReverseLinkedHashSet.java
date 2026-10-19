package collectionFramework.set.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ReverseLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		
		Object[] obj=lhs.toArray();
		
		//using for loop
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.println(obj[i]);
		}
		
		System.out.println("----------------------------------------------");
		//using recursion
		Iterator<Integer> l1 = lhs.iterator();
		printReverse(l1);

	}

	public static void printReverse(Iterator<Integer> iterator) {
		if (!iterator.hasNext()) {
			return;
		}

		int current = iterator.next();
		printReverse(iterator);
		System.out.println(current);

	}

}
