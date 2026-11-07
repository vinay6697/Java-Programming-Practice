package arrayProblems;

import java.util.Scanner;

public class LeftRotateArrayByKPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperations.readArray();
		System.out.println("Enter the no of rotations");
		int k = sc.nextInt();
		isLeftRotate(ar, k);
		sc.close();
	}

	public static void isLeftRotate(int[] ar, int k) {
		int r = k % ar.length;
		while (r > 0) {
			int temp = ar[0];
			int j = 1;

			while (j < ar.length) {
				ar[j - 1] = ar[j];
				j++;
			}

			ar[ar.length - 1] = temp;
			r--;
		}
		ArrayOperations.display(ar);
	}
}
