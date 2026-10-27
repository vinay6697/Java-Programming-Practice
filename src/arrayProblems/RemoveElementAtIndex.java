package arrayProblems;

import java.util.Scanner;

public class RemoveElementAtIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=ArrayOperations.readArray();
		System.out.println("Enter the index");
		int index=sc.nextInt();
		removeElement(ar,index);
		sc.close();
	}
	public static void removeElement(int[] ar,int index)
	{
		if(ar.length==0 || ar==null)
			System.out.println("please enter the elements");
		else if(index<0 || index> ar.length)
			System.out.println("invalid index");
		else
		{
			int[] br=new int[ar.length-1];
			for(int i=0;i<br.length;i++)
			{
				if(i<index)
					br[i]=ar[i];
				else
					br[i]=ar[i+1];
			}
			ArrayOperations.display(br);
		}
	}

}
