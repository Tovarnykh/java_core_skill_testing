package Inheritance_Practice_Store;

abstract class Product {
	int id;
	private String title;
	private int amount;
	private String description;
	private int cost;
	int daysleft;
	
	public Product(int id, String title, int amount, String description, int cost, int daysleft) {
		this.id = id;
		this.title = title;
		this.amount = amount;
		this.description = description;
		this.cost = cost;
		this.daysleft = daysleft;
	}

}
