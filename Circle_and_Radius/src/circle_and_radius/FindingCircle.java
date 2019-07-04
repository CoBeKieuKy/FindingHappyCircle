package circle_and_radius;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingCircle {
	public static void main(String[] args) {
		int min_index=0;
		double min_area;
		List<Circle> list = new ArrayList<Circle>();
		Scanner keyboard = new Scanner(System.in);
		
		for(int i=0; i<100; i++) {
			list.add(new Circle());
		}
		min_area= list.get(0).area;

		System.out.println("Input the area of the circle you want to find: ");
		int area_choice = keyboard.nextInt();
		keyboard.close();
		
		for(int i=1; i<list.size(); i++) {
			if(Math.abs(list.get(i).area- area_choice) < Math.abs(min_area - area_choice)) {
				min_index = i;
				min_area = list.get(i).area;
			}
		}
		
		System.out.println("The circle you need to find has index: "+min_index+" and area is: "+min_area);
	}
}
