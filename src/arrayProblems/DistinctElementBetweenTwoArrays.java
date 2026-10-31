package arrayProblems;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementBetweenTwoArrays {
	public static void main(String[] args) {
		int[] ar = ArrayOperations.readArray();
		int[] br = ArrayOperations.readArray();

		isDistinct(ar, br);
	}

	public static void isDistinct(int[] ar, int[] br) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			boolean flag = false;
			for (int j = 0; j < br.length; j++) {
				if (ar[i] == br[j]) {
					flag = true;
					br[j] = Integer.MIN_VALUE;
				}
			}
			if (flag == false) {
				if (set.add(ar[i]))
					System.out.println(ar[i]);
			}

		}
		for (int j = 0; j < br.length; j++) {
			if (br[j] != Integer.MIN_VALUE)
				if (set.add(br[j]))
					System.out.println(br[j]);
		}

	}
}
