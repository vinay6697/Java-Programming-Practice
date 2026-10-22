package collectionFramework.maps.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class ReverseOrderDisplay {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(111, "JAVA");
		tm.put(222, "SQL");
		tm.put(333, "WEB");
		tm.put(444, "ADV JAVA");
		tm.put(555, "PROGRAMMING");
		
		Set<Integer> keys=tm.descendingKeySet();
		
		for(int key:keys)
		{
			System.out.println(key+"----->"+tm.get(key));
		}
	}
}
