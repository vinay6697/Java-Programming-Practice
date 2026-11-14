package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] ar= {5,4,10,1,6,2};
		isInsertionSort(ar);
	}
	
	public static void isInsertionSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int temp=ar[i];
			int j=i-1;
			
			while(j>=0 && ar[j]>temp)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=temp;
		}
		System.out.println(Arrays.toString(ar));
	}

}
