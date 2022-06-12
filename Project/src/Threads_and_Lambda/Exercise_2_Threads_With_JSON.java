package Threads_and_Lambda;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class Exercise_2_Threads_With_JSON {
	
	static Random r = new Random();
	
	static ArrayList<Integer> numbers = new ArrayList<>();
	
	
	public static void main(String[] args){
		Instant startm = Instant.now();
		jsonWriter();
		jsonReader();
				for(int n:numbers) {
					Thread t = new Thread(()->{Instant start = Instant.now();
						Consumer<Integer> op;
					switch(r.nextInt(4)) {
					case 0:
						op = (x)->{
							int g=0;
							for(int i =0; i<=x; i++) {
								g+=i;
							}
							System.out.print("Sum of numbers in digit "+x+" = "+g);
						};
						op.accept(n);
						break;
					case 1:
						op = (x)->{
							int g=1;
							for(int i =1; i<=x; i++) {
								g=g*i;
							}
							System.out.print("Mutiplication of numbers in digit "+x+" = "+g);
						};
						op.accept(n);
						break;
					case 2:
						op = (x)->{
							double g=1;
							for(int i =0; i<=x; i++) {
								g=g/i;
							}
							System.out.print("Division of numbers in digit "+x+" = "+g);
						};
						op.accept(n);
						break;
					case 3:
						op = (x)->{
							int g=0;
							for(int i =0; i<x; i++) {
								g-=i;
							}
							System.out.print("Difference of numbers in digit "+x+" = "+g);
						};
						op.accept(n);
						break;
					default:
						System.out.print("error"+n);
						break;
					}
					Instant end = Instant.now();
					Duration timeElapsed = Duration.between(start, end);
					System.out.println(" - Time taken: "+ timeElapsed.toMillis() +" milliseconds");
					});
					t.start();
					try {
						t.join();
					} catch (InterruptedException e) {
						System.out.println("Something happend");
					}
				}
				Instant endm = Instant.now();
				Duration timeElapsed = Duration.between(startm, endm);
				System.out.println(" - Time taken: "+ timeElapsed.toMillis() +" milliseconds");
	}
	
	
	class DigitsClass{
		public ArrayList<Integer> digits = new ArrayList<>();
		 
		 @Override
		    public String toString() {
		        return "digits{" +
		        		digits +
		                '}';
		    }
	}
	
	static void jsonWriter(){
		
		ArrayList<Integer> digits = new ArrayList<>();
		for(int i =0; i< r.nextInt(9)+1; i++) {
			digits.add(r.nextInt(20));
		}
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonObject jsonObject = new JsonObject();
		JsonArray jsonArray = gson.toJsonTree(digits).getAsJsonArray();
		jsonObject.add("digits", jsonArray);

		
		FileWriter writer;
		try {
			writer = new FileWriter("digits.json");
			writer.write(gson.toJson(jsonObject));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void jsonReader(){
		
		Gson gson = new Gson();
		try (Reader reader = new FileReader("digits.json")) {
			
			DigitsClass dig = gson.fromJson(reader, DigitsClass.class);
			numbers = (ArrayList)dig.digits.clone();
			System.out.println(numbers);
		} catch (IOException e) {
        e.printStackTrace();
    }
	
}
}
