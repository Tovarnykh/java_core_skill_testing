package Tests;

public class Cat extends Animal{
	public Cat (String name, int age) {
		super(name);
	}
	
	public void display() {
		//super.display();
		System.out.println("Cat class: "+getName()+" ");
	}
	public void setAdnDisplay() {
		System.out.println(getName()+"fff");
	}
}
