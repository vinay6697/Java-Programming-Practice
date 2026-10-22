package collectionFramework.set.treeSet.comparable.assignment;

import java.util.TreeSet;

public class SortBottle {
	public static void main(String[] args) {
		Bottle b1=new Bottle("Nanobot",1000);
		Bottle b2=new Bottle("MansionHouse",2000);
		Bottle b3=new Bottle("Whisky",1000);
		
		TreeSet<Bottle> ts=new TreeSet<>();
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		
		for(Bottle b:ts)
		{
			System.out.println(b);
		}
	}
}
