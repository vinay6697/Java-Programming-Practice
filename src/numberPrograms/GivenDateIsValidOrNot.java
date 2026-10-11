package numberPrograms;

import java.util.Scanner;

public class GivenDateIsValidOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int dd = sc.nextInt();
		System.out.println("Enter the month");
		int mm = sc.nextInt();
		System.out.println("Enter the year");
		int yy = sc.nextInt();

		if ((dd < 1 && dd > 31) || (mm < 1 && mm > 12) || (yy < 1 && yy > 50000))
			System.out.println("invalid date");
		else if (dd > 30 && (mm == 4 || mm == 6 || mm == 9 || mm == 11))
			System.out.println("invalid date");
		else if (dd > 29 && mm == 2)
			System.out.println("invalid date");
		else if (dd > 28 && mm == 2 && (!(yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0))
			System.out.println("invalid date");
		else
			System.out.println("valid date");
		sc.close();
	}
}
