package EncapsulationExercise;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		CircleGenerator a = new CircleGenerator();
		a.generate(3);
		double b = a.circles.get(1).radius;
		a.circles.get(0).collisionCheck(a.circles.get(1));
		System.out.println(b);
	}

}