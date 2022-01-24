package JavaBasic;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
	}


private static class Point{
	private double x;
	private double y;
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	private float calcLength (Point otherPoint) {
		return 0;
	}
	
}

private static class Circle{
	private double radius;
	Point point;
	Circle(double radius, Point point){
		this.radius = radius;
		this.point = point;
	}
	private boolean collisionCheck(Circle otherCircle) {
		return false;
	}
}

private static class CircleGeneretor{
		Random rand = new Random();
		ArrayList<Circle> circles = new ArrayList<Circle>();
		private void generate(int countOfCircles) {
			//genearting random circles with random radiuses
			for(int i = 0; i<countOfCircles;i++) {
				Point point = new Point(rand.nextDouble(),rand.nextDouble());
				
				//Circle circle = new Circle();
			}
		}
		private int calcCountOfCollisions() {
			return 0;
		}
	}

}