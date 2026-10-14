package arrayProblems;

import java.util.Scanner;

public class ArrayOperations {
	public static int[] readArray()
	{
		int[] array=null;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();
			
			//creating an integer array
			array=new int[size];
			
			System.out.println("Enter the elements into the array");
			for(int i=0;i<array.length;i++)
			{
				array[i]=sc.nextInt();
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return array;
	}
	
	public static void display(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			if(i<array.length)
				System.out.print(array[i]+" ");
		}
	}
}
