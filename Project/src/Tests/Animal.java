package Tests;

public class Animal<T> extends Organism{
	protected T name;
	
	protected T id;
	
	public Animal(T name, T id) {
		this.name=name;
		this.id = id;
	}
	
	
	public void display() {
		System.out.println("Animal clas:" +name);
	}
	public void Breathe() {
		
	}
	public void setName(T name) {
		this.name = name;
	}


	
	
}
