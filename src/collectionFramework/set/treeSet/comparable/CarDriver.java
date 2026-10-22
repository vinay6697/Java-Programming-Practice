package collectionFramework.set.treeSet.comparable;

import java.util.TreeSet;

public class CarDriver {
	public static void main(String[] args) {
		TreeSet<Car> cars=new TreeSet<>();
		Car c1=new Car(300);
		Car c2=new Car(100);
		Car c3=new Car(200);
		
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		
		for(Car car:cars)
		{
			System.out.println(car);
		}
	}
}
