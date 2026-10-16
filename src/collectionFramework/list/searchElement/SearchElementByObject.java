package collectionFramework.list.searchElement;

/* searching the student object using contains method 
 * contains method internally calls equals method for comparison*/
import java.util.ArrayList;

public class SearchElementByObject {
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
		
		//search a student in the list
		//key element is student object
		Student keyElement=new Student(333,"Martin",23);
		
		System.out.println("----------------------------------");
		 
		if(students.contains(keyElement))
		{
			System.out.println("student "+keyElement.getName()+" exists in students list");
		}
		else
			System.out.println("student "+keyElement.getName()+" doest not exists in students list");
	}
}	
