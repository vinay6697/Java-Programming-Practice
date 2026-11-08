package arrayProblems;

import java.util.Scanner;

public class RightRotateArrayByKpositions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=ArrayOperations.readArray();
		System.out.println("Enter the no of rotations");
		int k=sc.nextInt();
		isRotate(ar,k);
		sc.close();
	}
	
	public static void isRotate(int[] ar,int k)
	{
		int r=k%ar.length;
		
		while(r>0)
		{
			int temp=ar[ar.length-1];
			int j=ar.length-2;
			
			while(j>=0)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[0]=temp;
			r--;
		}
		ArrayOperations.display(ar);
	}

}
