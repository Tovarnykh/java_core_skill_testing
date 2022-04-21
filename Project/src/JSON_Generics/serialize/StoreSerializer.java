package JSON_Generics.serialize;

import com.google.gson.*;

import JSON_Generics.Fruit;
import JSON_Generics.FruitStore;
import java.lang.reflect.Type;


public class StoreSerializer implements JsonSerializer<FruitStore>{
	
	@Override
	public JsonElement serialize(FruitStore src, Type typeOfSrc, JsonSerializationContext context)
	{
		JsonObject result = new JsonObject();
		for(Fruit fruit : src.getFruits()) {
			result.add("fruit", context.serialize(fruit));
		}
		
		return result;
	}
	
}
