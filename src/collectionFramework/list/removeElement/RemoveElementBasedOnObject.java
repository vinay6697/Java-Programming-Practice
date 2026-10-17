package collectionFramework.list.removeElement;

import java.util.ArrayList;

public class RemoveElementBasedOnObject {
	public static void main(String[] args) {
		ArrayList<String> countries=new ArrayList<>();
		countries.add("India");
		countries.add("Russia");
		countries.add("Itcountriesy");
		countries.add("USA");
		countries.add("Srilanka");
		
		//before removing the country object
		System.out.println(countries);
		String country="USA";
		countries.remove(country);
		
		//after removing the country object
		System.out.println(countries);
	}
}
