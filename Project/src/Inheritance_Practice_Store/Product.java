package Inheritance_Practice_Store;

abstract class Product {
	private String title;
	private int amount;
	private String description;
	private int cost;
	private int daysleft;
	
	public Product(String title, int amount, String description, int cost, int daysleft) {
		this.title = title;
		this.amount = amount;
		this.description = description;
		this.cost = cost;
		this.daysleft = daysleft;
	}
	
}
