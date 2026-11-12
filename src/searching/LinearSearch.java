package searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = { 5, 10, 84, 96, 35, 78, 12, 54 };
		System.out.println("Enter the element to be searched");
		int ele = sc.nextInt();
		int index = linearSearch(ar, ele);
		if (index != -1)
			System.out.println("Element found at index: " + index);
		else
			System.out.println("Element not found");
		sc.close();

	}

	public static int linearSearch(int[] ar, int ele) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ele)
				return i;
		}
		return -1;
	}
}
