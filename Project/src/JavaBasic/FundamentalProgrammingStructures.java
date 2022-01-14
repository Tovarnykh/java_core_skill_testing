package JavaBasic;

import java.util.Scanner;

final class FundamentalProgrammingStructures {
	public static void main(String[] args) {
		scannerExercise();
	}
	
	private static void scannerExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your city name: ");
		String city = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("\n---------------\nName: "+name+"\nCity: "+city+"\nAge: "+age+"\n---------------");
	}
	
}
