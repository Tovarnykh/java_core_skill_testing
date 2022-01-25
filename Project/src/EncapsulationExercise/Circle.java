package EncapsulationExercise;


public class Circle{
	double radius;
	Point point;
	Circle(double radius, Point point){
		this.radius = radius;
		this.point = point;
	}
	public boolean collisionCheck(Circle otherCircle) {
		return (this.radius+otherCircle.radius) > point.calcLength(otherCircle.point)? true : false;
	}
	
}
