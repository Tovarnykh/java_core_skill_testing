package Tests;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args){
		
		ArrayList words = new ArrayList();
		
		words.add("Germany");
		words.add("Austria");
		words.add("Germany");
		words.add("America");
		words.add("Ukraine");

		System.out.println(words);
		ListIterator<String> iterator = words.listIterator();
		
	}
	
}

