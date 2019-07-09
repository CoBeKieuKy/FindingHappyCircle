package circle_and_radius;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindingCircle {
	public static void main(String[] args) {
		int min_index=0;
		int area_choice;
		double radius;
		double diff, diff2;
		final int NUMBER_OF_CIRCLE = 100;
		
		List<Integer> index_list = new ArrayList<Integer>();
		List<Circle> list = new ArrayList<Circle>();
		Scanner keyboard = new Scanner(System.in);
		
		for(int i=0; i<NUMBER_OF_CIRCLE; i++) {
			list.add(new Circle());
		}
		
		System.out.println("Input the area of the circle you want to find: ");
		area_choice = keyboard.nextInt();		
		keyboard.close();
		radius = Math.sqrt(area_choice/Circle.PI);
				
		Collections.sort(list, new Comparator<Circle>(){
			public int compare(Circle o1, Circle o2) {
				return (o1.radius-o2.radius);
			}
		});
		
		diff = Math.abs(list.get(0).radius-radius);
		
		for(int i=0; i<list.size(); i++) {
			diff2 = Math.abs(list.get(i).radius - radius);
			if(diff2 < diff) {
				min_index = i;
				diff = diff2;
				index_list = new ArrayList<Integer>();
				index_list.add(i);
			}
			else if(diff2 == diff)
				index_list.add(i);
		}
				
		System.out.println("The circle you need to find has index: ");
		
		System.out.println(index_list);
		System.out.println("and the area is: "+list.get(min_index).getArea());
		
		System.out.println();
		System.out.println("$$$$$$ CIRCLE LIST SORTED BY RADIUS $$$$$$");
		for(int i=0; i<list.size(); i++)
			System.out.println("Id: "+i+" - Radius: "+list.get(i).radius+" - Area: "+list.get(i).getArea());	
	}
}
