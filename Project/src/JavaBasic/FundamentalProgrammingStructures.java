package JavaBasic;

import java.util.Scanner;

final class FundamentalProgrammingStructures {
	public static void main(String[] args) {
		scannerExercise2();
	}
	
	private static void scannerExercise1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your city name: ");
		String city = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("\n---------------\nName: "+name+"\nCity: "+city+"\nAge: "+age+"\n---------------");
	}
	
	private static void scannerExercise2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main text: ");
		String text = sc.nextLine();
		System.out.println("Something to add: ");
		String text2 = sc.nextLine();
		System.out.println("Position: ");
		int pos = sc.nextInt();
		StringBuffer newtext = new StringBuffer(text);
		newtext.insert(pos,text2);
		System.out.println(newtext);
	}
}
