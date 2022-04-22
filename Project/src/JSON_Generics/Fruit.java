package JSON_Generics;

public class Fruit {
	
	private Fruits type;
	private int shelfLife;
	private String dataReceipts;
	private int cost;
	
	public Fruit(Fruits type, int shelfLife, String dataReceipts, int cost) {
		this.type = type;
		this.shelfLife = shelfLife;
		this.dataReceipts = dataReceipts;
		this.cost = cost;
	}
	public Fruit() {
		
	}
	
	public Fruits getType() {
		return type;
	}
	public void setType(Fruits type) {
		this.type = type;
	}
	public int getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}
	public String getDataReceipts() {
		return dataReceipts;
	}
	public void setDataReceipts(String dataReceipts) {
		this.dataReceipts = dataReceipts;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
