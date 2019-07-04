package circle_and_radius;

import java.util.Random;

public class Circle {
	int radius;
	static double PI = 3.1416;
	
	public Circle() {
		radius = new Random().nextInt(100)+1;
	}
	
	public double getArea() {
		return (radius*radius*PI);
	}
}
