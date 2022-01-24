package EncapsulationExercise;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	
	
	public static void main(String[] args) {
		CircleGeneretor.generate(4);
	}


public static class Point{
	private double x,y;
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	private double calcLength (Point otherPoint) {
		return Math.sqrt(Math.pow(otherPoint.x-this.x,2)+Math.pow(otherPoint.y-this.y,2));
	}
	
}

public static class Circle{
	private double radius;
	Point point;
	Circle(double radius, Point point){
		this.radius = radius;
		this.point = point;
	}
	private boolean collisionCheck(Circle otherCircle,double length) {
		return this.radius+otherCircle.radius>length? false : true;
	}
}

private class CircleGeneretor{
		Random rand = new Random();
		ArrayList<Circle> circles = new ArrayList<Circle>();
		private static void generate(int countOfCircles) {
			for(int i = 0; i<countOfCircles;i++) {
				Point point = new Point(rand.nextDouble(),rand.nextDouble());
				Circle circle = new Circle(rand.nextDouble(),point);
				circles.add(circle);
			}
		}
		/*private int calcCountOfCollisions() {
			for(int i =0; i<circles.size();i++) {
				
			}
			return 0;
		}*/
	}

}