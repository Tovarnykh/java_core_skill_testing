package EncapsulationExercise;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		CircleGenerator a = new CircleGenerator();
		a.generate(3);
		System.out.println(a.calcCountOfCollisions());
	}

}