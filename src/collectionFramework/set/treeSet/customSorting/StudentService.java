package collectionFramework.set.treeSet.customSorting;

import java.util.TreeSet;

public class StudentService {
	
	public TreeSet<Student> createStudentSet(int choice)
	{
		TreeSet<Student> students;
		
		switch(choice)
		{
			case 1:
			{
				students=new TreeSet<Student>(new SortStudentByAge());
				break;
			}
			case 2:
			{
				students=new TreeSet<Student>(new SortStudentByName());
				break;
			}
			default:
			{
				throw new IllegalArgumentException("Invalid choice");
			}
		}
		return students;
	}

}
