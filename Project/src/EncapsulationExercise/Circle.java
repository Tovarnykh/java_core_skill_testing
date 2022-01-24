package EncapsulationExercise;

import EncapsulationExercise.Main.Point;

public class Circle{
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
