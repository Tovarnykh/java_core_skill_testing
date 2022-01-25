package EncapsulationExercise;

import java.util.ArrayList;
import java.util.Random;

public class CircleGenerator {
	Random rand = new Random();
	ArrayList<Circle> circles = new ArrayList<Circle>();
	public void generate(int countOfCircles) {
		for(int i = 0; i<countOfCircles;i++) {
			Point point = new Point(rand.nextDouble(),rand.nextDouble());
			Circle circle = new Circle(rand.nextDouble(),point);
			circles.add(circle);
		}
	}
	/*private int calcCountOfCollisions() {
		for(int i =0; i<circles.size();i++) {
			Circle x = circles.get(i);
			Circle y = circles.get(i+1);
			//x.collision
		}
		return 0;
	}*/
}
