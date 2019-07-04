package circle_and_radius;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
				
		Collections.sort(list, new Comparator<Circle>(){
			public int compare(Circle o1, Circle o2) {
				return (o1.radius-o2.radius);
			}
		});
		
		for(int i=1; i<list.size(); i++) {
			if(Math.abs(list.get(i).area- area_choice) < Math.abs(min_area - area_choice)) {
				min_index = i;
				min_area = list.get(i).area;
			}
		}
		
		System.out.println("The circle you need to find has index: "+min_index+" and area is: "+min_area);
		System.out.println();
		System.out.println("$$$$$$ CIRCLE LIST SORTED BY RADIUS $$$$$$");
		for(int i=0; i<list.size(); i++)
			System.out.println("Id: "+i+" - Radius: "+list.get(i).radius+" - Area: "+list.get(i).area);		
	}
}
