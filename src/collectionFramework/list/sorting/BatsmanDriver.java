package collectionFramework.list.sorting;

import java.util.Collections;
import java.util.LinkedList;

public class BatsmanDriver {
	public static void main(String[] args) {
		LinkedList<Batman> batmen = new LinkedList<>();

		batmen.add(new Batman("Virat", 95.5, 80));
		batmen.add(new Batman("Rohit", 92.0, 50));
		batmen.add(new Batman("Sachin", 86.2, 100));
		batmen.add(new Batman("Gill", 98.5, 10));
		batmen.add(new Batman("Dhoni", 87.5, 10));
		
		System.out.println("------------before sorting------------");
		
		for(Batman batman:batmen)
		{
			System.out.println(batman);
		}
		
		System.out.println("------------after sorting------------");
		Collections.sort(batmen);
		
		for(Batman batman:batmen)
		{
			System.out.println(batman);
		}
	}

}
