package numberPrograms;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius ");
		double radius=sc.nextDouble();
		findArea(radius);
		findCircumference(radius);
		sc.close();
	}
	
	public static void findArea(double radius)
	{
		//to find area of a square 
		double area=3.14*radius* radius;
		System.out.println("area of cirlce is: "+area);
	}
	
	
	
	public static void findCircumference(double radius)
	{
		double circum=2*3.14*radius;
		System.out.println("circumference of cirlce is: "+circum);
	}
}
