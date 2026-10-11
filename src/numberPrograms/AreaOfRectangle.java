package numberPrograms;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth");
		double breadth = sc.nextDouble();

		findArea(length, breadth);
		findPerimeter(length, breadth);
		sc.close();
	}

	public static void findArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectanlge is: " + area);
	}

	public static void findPerimeter(double length, double breadth) {
		double perimeter = 2 * (length * breadth);
		System.out.println("perimeter of rectanlge is: " + perimeter);
	}
}
