package collectionFramework.set.treeSet.comparable.assignment;

import java.util.TreeSet;

public class SortPen {
	public static void main(String[] args) {
		Pen p1=new Pen("Camel",12.37);
		Pen p2=new Pen("Apasara",12.37);
		Pen p3=new Pen("Natraj",13.96);
		
		TreeSet<Pen> ts=new TreeSet<Pen>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		
		for(Pen p:ts)
		{
			System.out.println(p);
		}
	}

}
