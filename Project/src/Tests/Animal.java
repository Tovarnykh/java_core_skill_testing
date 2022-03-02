package Tests;

public class Animal {
	private String name;
	public String getAnimalName() {
	return name;	
	}
	public Animal(String name) {
		this.name=name;
	}
	public void display() {
		System.out.println(name);
	}
	public void Breathe() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
}
