package collectionFramework.maps.HashMap;

import java.util.HashMap;
import java.util.Set;

public class PersonDriver {
	public static void main(String[] args) {
		HashMap<Person,Integer> hm=new HashMap<>();
		Person p1=new Person(1,"Alex",25000);
		Person p2=new Person(3,"George",35000);
		Person p3=new Person(1,"Martha",30000);
		
		hm.put(p1, 111);
		hm.put(p2, 222);
		hm.put(p3, 333);
		hm.put(p3, 333);
		
		System.out.println("==================");
		Set<Person> persons=hm.keySet();
		
		for(Person person:persons)
		{
			System.out.println(person+"\t-->"+hm.get(person));
		}
	}
}
