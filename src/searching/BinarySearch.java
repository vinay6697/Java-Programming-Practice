package searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar= {10,24,32,47,56,64,71,98,101};
		System.out.println("Enter the element to be searched");
		int ele=sc.nextInt();
		int result=binarySearch(ar,ele);
		if(result!=-1)
			System.out.println("Element found at index: "+result);
		else
			System.out.println("Element not found");
		sc.close();
	}
	
	public static int binarySearch(int[] ar,int ele)
	{
		int start=0;
		int end=ar.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(ele==ar[mid])
				return mid;
			else if(ele>ar[mid])
				start=mid+1;
			else 
				end=mid-1;
		}
		return -1;
	}
}
