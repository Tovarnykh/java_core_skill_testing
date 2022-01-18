package JavaBasic;

import java.util.Scanner;

final class FundamentalProgrammingStructures {
	
	protected static Scanner sc = new Scanner(System.in);
	
	
	private static void scannerExercise1() {
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your city name: ");
		String city = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("\n---------------\nName: "+name+"\nCity: "+city+"\nAge: "+age+"\n---------------");
	}
	
	private static void scannerExercise2() {
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
	
	private static void arrayExercise1() {
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] mass = new int[size];
		for(int i =0; i<size;i++) {
			mass[i] = sc.nextInt();
			System.out.print(mass[i]+" ");
		}
		int min = mass[0];
		int max = mass[0];
		int rep = 0;
		for(int numb:mass) {
			if(numb<min) {
				min = numb;
			}
			if(numb>max) {
				max = numb;
			}
			if(numb==5)
				rep++;
		}
		System.out.println("\nmin: "+min+"; max: "+max+"; rep: "+rep);
	}

	
}
