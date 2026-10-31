package arrayProblems;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readArray();
		int[] br = ArrayOperations.readArray();
//		isCommon(ar, br);
		isCommon(ar, br);
	}

	public static void isCommon(int[] ar, int[] br) {
		for (int i = 0; i < ar.length; i++) {
			boolean flag = false;
			for (int j = 0; j < br.length; j++) {
				if (ar[i] == br[j]) {
					flag = true;
					br[j] = Integer.MIN_VALUE;
				}
			}
			if (flag == true) {
				System.out.println(ar[i]);

			}
		}
	}

	// using hashset and optimized
	public static void isCommonElements(int[] ar, int[] br) {
		Set<Integer> set = new HashSet<>();

		for (int num : br) {
			set.add(num);
		}

		Set<Integer> printed = new HashSet<>();

		for (int num : ar) {
			if (set.contains(num) && printed.add(num)) {
				System.out.println(num);
			}
		}
	}

}
