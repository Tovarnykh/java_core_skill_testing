package JSON_Generics.serialize;

import com.google.gson.*;

import JSON_Generics.Fruit;
import java.lang.reflect.Type;

public class FruitSerializer implements JsonSerializer<Fruit> {
	
	@Override
	public JsonElement serialize(Fruit src, Type typeOfSrc, JsonSerializationContext context) {
		JsonObject result = new JsonObject();
		
		result.add("fruit", context.serialize(src.getType()));
		
		result.addProperty("expiration term", src.getShelfLife());
		result.addProperty("arrival date", src.getDataReceipts());
		result.addProperty("cost", src.getCost());
		
		return result;
	}
}
