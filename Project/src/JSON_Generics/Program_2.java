package JSON_Generics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;




class Program_2 {
	public static void main(String[] args){
		FruitStore stock = new FruitStore();
		Fruit tmpFruit;
		
		tmpFruit = new Fruit(Fruits.APPLE, 10, "21.04.2022", 5);
		stock.fruits.add(tmpFruit);
		tmpFruit = new Fruit(Fruits.ORANGE, 12, "21.04.2022", 10);
		stock.fruits.add(tmpFruit);
		stock.saveFruits(stock);
	}

	 class LineClass{
		 public ArrayList<String> lines = new ArrayList<>();
		 
		 @Override
		    public String toString() {
		        return "lines{" +
		        		lines +
		                '}';
		    }
	}

		void lineReader(){
			
			Gson gson = new Gson();

			try (Reader reader = new FileReader("lines.json")) {
				
				LineClass line = gson.fromJson(reader, LineClass.class);
				System.out.println(line);
			} catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
		void jsonWriter() throws IOException{

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String[] lines = {"First", "Second", "Third", "fourth", "Fifth"};
		
		
		JsonObject jsonObject = new JsonObject();
		JsonArray jsonArray = gson.toJsonTree(lines).getAsJsonArray();
		jsonObject.add("lines", jsonArray);

		
		FileWriter writer = new FileWriter("lines.json");
		writer.write(gson.toJson(jsonObject));
		writer.close();
	}
		
			
		
}
