package EncapsulationExercise;


public class Circle{
	double radius;
	Point point;
	Circle(double radius, Point point){
		this.radius = radius;
		this.point = point;
	}
	public boolean collisionCheck(Circle otherCircle) {
		System.out.print(otherCircle.point.x);
		//this.radius+otherCircle.radius>calcLength(otherCircle.point)? false : true;
		return false;
	}
	
}
