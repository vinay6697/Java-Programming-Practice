package collectionFramework.list.searchElement;

import java.util.ArrayList;

public class PigeonDriver {
	public static void main(String[] args) {
		ArrayList<Pigeon> pigeons = new ArrayList<Pigeon>();

		pigeons.add(new Pigeon("Oriental Roller", 2));
		pigeons.add(new Pigeon("Ice Pigeon", 1));
		pigeons.add(new Pigeon("Antwerp Smerle", 3));
		pigeons.add(new Pigeon("Egyptian Swift Pigeon", 5));
		pigeons.add(new Pigeon("African Owl Pigeon", 3));
		
		for(int i=0;i<pigeons.size();i++)
		{
			System.out.println(pigeons.get(i));
		}
		Pigeon keyElement=new Pigeon("Egyptian Swift Pigeon", 5);
		int index=pigeons.indexOf(keyElement);
		if(index!=-1)
			System.out.println("pigeon "+keyElement.getBreed()+" found at index:"+index);
		else
			System.out.println("pigeon "+keyElement.getBreed()+" not found");

	}

}
