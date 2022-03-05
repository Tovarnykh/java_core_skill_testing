package Tests;

public class Animal extends Organism{
	private String name;
	
	
	public Animal(String name) {
		this.name=name;
	}
	
	
	public void display() {
		System.out.println("Animal clas:" +name);
	}
	public void Breathe() {
		
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
	
}
