package collectionFramework.list.removeElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShoeDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Shoe> shoes = new ArrayList<>();
		shoes.add(new Shoe(101, 2000.0, "Red"));
		shoes.add(new Shoe(102, 1500.0, "Black"));
		shoes.add(new Shoe(103, 1800.0, "Green"));
		shoes.add(new Shoe(104, 2500.0, "White"));
		shoes.add(new Shoe(105, 3000.0, "Blue"));
		
		System.out.println("------ before Removing ------");
		
		for(Shoe shoe:shoes)
		{
			System.out.println(shoe);
		}
		
		System.out.println();
		System.out.println("Enter the shoe id");
		int id=sc.nextInt();
		
		
		removeByAttributes(shoes,id);
		
		System.out.println("------ After Removing ------");
		
		for(Shoe shoe:shoes)
		{
			System.out.println(shoe);
		}
		sc.close();
	}
	
	public static ArrayList<Shoe> removeByAttributes(ArrayList<Shoe> shoes,int id)
	{
		boolean removed=false;
		Iterator<Shoe> iterator=shoes.iterator();
		while(iterator.hasNext())
		{
			Shoe shoe=iterator.next();
			if(shoe.getPid()==id)
			{
				iterator.remove();
				removed=true;
				System.out.println("Shoe object removed successfully");
				break;
			}
		}
		if(removed==false)
			System.out.println("Shoe id not found");
		
		return shoes;
	}
}
