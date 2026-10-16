package collectionFramework.list.searchElement;

import java.util.ArrayList;

public class SearchElementByIndexOf {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(111,"Smith",25));
		students.add(new Student(222,"Allen",22));
		students.add(new Student(333,"Martin",23));
		students.add(new Student(444,"Clark",25));
		students.add(new Student(555,"George",24));
		
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
		System.out.println("-------------------------");
		
		Student keyElement=new Student(222,"Allen",22);
		if(students.indexOf(keyElement)!=-1)
			System.out.println("Student "+keyElement.getName()+" found at index: "+students.indexOf(keyElement));
		else
			System.out.println("Student "+keyElement.getName()+" does not exists found at index:");
	}

}
