package sorting;

import arrayProblems.ArrayOperations;

public class CyclicSort {
	public static void main(String[] args) {
		int[] ar=ArrayOperations.readArray();
		isCyclicSort(ar);
		ArrayOperations.display(ar);
	}
	
	public static void isCyclicSort(int[] ar)
	{
		int i=0;
		while(i<ar.length)
		{
			int correct=ar[i]-1;
			if(ar[i]!=ar[correct])
				swap(ar,i,correct);
			else
				i++;
		}
	}
	
	public static void swap(int[] ar,int start,int end)
	{
		int temp=ar[start];
		ar[start]=ar[end];
		ar[end]=temp;
	}

}
