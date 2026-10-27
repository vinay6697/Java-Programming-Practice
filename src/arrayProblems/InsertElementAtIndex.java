package arrayProblems;

import java.util.Scanner;

public class InsertElementAtIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperations.readArray();
		System.out.println("Enter the index");
		int index = sc.nextInt();
		System.out.println("Enter the element");
		int element = sc.nextInt();
		isInsert(ar, index, element);
		sc.close();
	}

	public static void isInsert(int[] ar, int index, int element) {
		if (ar == null || ar.length == 0) {
			System.out.println("please insert elements into array");
		} 
			if (index < 0 || index > ar.length) 
				System.out.println("invalid index");
			
				int[] br = new int[ar.length + 1];
				
				for (int i = 0; i < br.length; i++) {
					if (i < index)
						br[i] = ar[i];
					else if (i == index)
						br[index] = element;
					else
						br[i] = ar[i - 1];
				}
				ArrayOperations.display(br);
	}
}
