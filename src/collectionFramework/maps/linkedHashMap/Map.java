package collectionFramework.maps.linkedHashMap;

import java.util.Collection;
import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
		//put ( ) is used to add the data into the map in key and value pairs
		hm.put(10, "java");
		hm.put(20, "sql");
		hm.put(30, "web");
		hm.put(40, "python");
		
		System.out.println(hm);
		System.out.println("----------------------");

		//get( ) is used to get the value based on the key specified
		System.out.println(hm.get(10));
		System.out.println(hm.get(30));
		System.out.println("----------------------");

		//remove( ) is used to delete an entry based on the key specefied
		hm.remove(40);
		
		System.out.println(hm);

		System.out.println("----------------------");
		
		//containsKey() is used to check if the map contains the given key or not
		System.out.println(hm.containsKey(10));
		
		System.out.println("----------------------");
		
		//containsValue() is used to check if the map contains the given value or not
		System.out.println(hm.containsValue("Web"));
		
		System.out.println("----------------------");
		
		System.out.println(hm.isEmpty());
//		hm.clear();
		System.out.println(hm.isEmpty());
		System.out.println("----------------1234------");
		
		Collection<String> c = hm.values();
		for(String s:c)
		{
			System.out.println(s);
		}

	}
}











