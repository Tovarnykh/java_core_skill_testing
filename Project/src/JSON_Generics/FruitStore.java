package JSON_Generics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import JSON_Generics.Program_2.LineClass;
import JSON_Generics.serialize.FruitDeserializer;
import JSON_Generics.serialize.FruitSerializer;

public class FruitStore {
	List<Fruit> fruits = new LinkedList<>();
	
	void addFruits(){
		
	}
	
	void saveFruits(FruitStore store){
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.registerTypeAdapter(Fruit.class, new FruitSerializer())
				.create();
		
		String json = gson.toJson(store);
		System.out.print(json);
		FileWriter writer;
		
		try {
			writer = new FileWriter("Stock.json");
			writer.write(gson.toJson(store));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
		void loadFruitList(FruitStore store) {
		
		Gson gson = new GsonBuilder()
				.registerTypeAdapter(Fruit.class, new FruitDeserializer())
				.create();
		try (Reader reader = new FileReader("Stock.json")) {
			System.out.println(reader);
			 FruitStore newStore = gson.fromJson(reader, FruitStore.class);
			
		} catch (IOException e) {
        e.printStackTrace();
    }
	}

	public List<Fruit> getFruits() {
		return new LinkedList<>(fruits);
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	
	
	
	
}
