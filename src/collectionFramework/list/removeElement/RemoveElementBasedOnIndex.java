package collectionFramework.list.removeElement;

import java.util.ArrayList;

public class RemoveElementBasedOnIndex {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//before removing the element
		System.out.println(list);
		
		//remove the first element from the list
		list.remove(0);
		
		//remove the last element from the list
		list.remove(list.size()-1);
		
		//after removing the element
		System.out.println(list);
	}

}
