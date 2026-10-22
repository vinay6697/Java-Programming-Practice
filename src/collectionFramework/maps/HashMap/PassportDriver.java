package collectionFramework.maps.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class PassportDriver {
	public static void main(String[] args) {
		Passport p1 = new Passport("vinay", "vin1343");
		Passport p2 = new Passport("sanjay", "san1344");
		Passport p3 = new Passport("darshan", "dar1345");
		Passport p4 = new Passport("akshay", "aks1346");

		Passport p5 = new Passport("darshana", "dar1345");
		Passport p6 = new Passport("akshaya", "aks1346");

		HashMap<Passport, String> hm = new HashMap<>();
		hm.put(p1, "male");
		hm.put(p2, "male");
		hm.put(p3, "male");
		hm.put(p4, "male");
		hm.put(p5, "female");
		hm.put(p6, "female");
		
		Set<Entry<Passport,String>> entry=hm.entrySet();
		Iterator<Entry<Passport,String>> itr=entry.iterator();
		while(itr.hasNext())
		{
			Entry<Passport,String> e=itr.next();
			Passport passport=(Passport)e.getKey();
			System.out.println(passport.pid+" "+passport.name+"\t"+e.getValue());
		}
		
	}
}
