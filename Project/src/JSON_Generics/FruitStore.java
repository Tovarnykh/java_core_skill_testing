package JSON_Generics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import JSON_Generics.serialize.FruitSerializer;
import JSON_Generics.serialize.StoreSerializer;

public class FruitStore {
	List<Fruit> fruits = new LinkedList<>();
	
	void addFruits(){
		
	}
	
	void saveFruits(FruitStore store){
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				
				.registerTypeAdapter(Fruit.class, new FruitSerializer())
				//.registerTypeAdapter(FruitStore.class, new StoreSerializer())

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
	
	void loadFruitList() {
		
	}

	public List<Fruit> getFruits() {
		return new LinkedList<>(fruits);
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	
	
	
	
}
