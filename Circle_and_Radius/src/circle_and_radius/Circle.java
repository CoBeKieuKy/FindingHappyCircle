package circle_and_radius;

import java.util.Random;

public class Circle {
	int radius;
	double area;
	static double PI = 3.1416;
	
	public Circle() {
		radius = new Random().nextInt(100)+1;
		area = radius*radius*PI;
	}
	
	public double getArea() {
		return this.area;
	}
}
