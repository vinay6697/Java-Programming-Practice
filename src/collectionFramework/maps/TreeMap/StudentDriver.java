package collectionFramework.maps.TreeMap;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the size of objects to be added");
		int size=sc.nextInt();
		
		TreeMap<Integer ,Student> tm=new TreeMap<>();
		
		System.out.println("Enter roll no and names");
		for(int i=0;i<size;i++)
		{
			Student student=new Student(sc.nextInt(),sc.nextLine());
			
			tm.put(student.rollNo, student);
		}
		
		Set<Entry<Integer,Student>> keys=tm.entrySet();
		for(Entry<Integer,Student> key:keys)
		{
			int rollNo=key.getKey();
			Student student=(Student)key.getValue();
			System.out.println(rollNo+"--->"+student.name);
		}
		sc.close();
	}

}
