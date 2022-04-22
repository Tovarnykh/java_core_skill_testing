package JSON_Generics.serialize;

import com.google.gson.*;

import JSON_Generics.Fruit;
import JSON_Generics.Fruits;

import java.lang.reflect.Type;

public class FruitDeserializer implements JsonDeserializer<Fruit>{
	@Override
	public Fruit deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException{
		JsonObject jsonObject = json.getAsJsonObject();
		
		Fruit fruit = new Fruit();
		
		fruit.setType(Fruits.fromString(jsonObject.get("fruit").getAsString()));
		fruit.setShelfLife(jsonObject.get("expiration term").getAsInt());
		fruit.setDataReceipts(jsonObject.get("arrival date").getAsString());
		fruit.setCost(jsonObject.get("cost").getAsInt());

		return fruit;
	}
}
