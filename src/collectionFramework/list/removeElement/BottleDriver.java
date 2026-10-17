package collectionFramework.list.removeElement;

import java.util.LinkedList;
import java.util.Scanner;

public class BottleDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Bottle> bottles=new LinkedList<>();
		bottles.add(new Bottle("Babosi", 200, "black"));
		bottles.add(new Bottle("Nlistgene", 100, "Silver"));
		bottles.add(new Bottle("Reebok", 150, "Red"));
		bottles.add(new Bottle("Miltonware", 250, "coated black"));
		bottles.add(new Bottle("Ensu", 200, "brown"));
		
		System.out.println("-------before removing-------");
		for(Bottle bottle:bottles)
		{
			System.out.println(bottle);
		}
		System.out.println("Enter the index");
		int index=sc.nextInt();
		
		removeByIndex(bottles,index);
		
		System.out.println("---------After removing--------");
		for(Bottle bottle:bottles)
		{
			System.out.println(bottle);
		}
		sc.close();
	}
	
	public static void removeByIndex(LinkedList<Bottle> bottles,int index)
	{
		if(index<0 || index>bottles.size())
			System.out.println("invalid index");
		else
		{
			System.out.println(bottles.get(index));
			bottles.remove(index);
			
		}
	}
}
