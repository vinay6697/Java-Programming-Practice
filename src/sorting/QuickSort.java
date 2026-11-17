package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] ar= {7,6,10,5,9,2,1,15,7};
		
		quick(ar,0,ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
	
	public static void quick(int[] ar, int lb,int ub)
	{
		if(lb<ub)
		{
			int loc=partation(ar,lb,ub);
			quick(ar,lb,loc-1);
			quick(ar,loc+1,ub);
		}
	}
	
	public static int partation(int[] ar,int lb,int ub)
	{
		int start=lb;
		int end=ub;
		
		int pivot=ar[lb];
		
		while(start<end)
		{
			while(start <= ub && ar[start] <= pivot) {
				start++;
			}
			
			while(ar[end]>pivot)
			{
				end--;
			}
			
			if(start<end)
			{
				int temp=ar[start];
				ar[start]=ar[end];
				ar[end]=temp;
			}
		}
		
		int temp=ar[lb];
		ar[lb]=ar[end];
		ar[end]=temp;
		
		return end;
	}
}
