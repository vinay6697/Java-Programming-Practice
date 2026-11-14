package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ar= {7,4,10,8,3,1};
		isSelectionSort(ar);
	}
	
	public static void isSelectionSort(int[] ar)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[min])
					min=j;
			}
			
			if(min!=i)
			{
				int temp=ar[i];
				ar[i]=ar[min];
				ar[min]=temp;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
