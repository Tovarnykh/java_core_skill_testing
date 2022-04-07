package Tests;

public class Cat<T,E> extends Animal{
	public Cat (T name,E id) {
		super(name,id);
	}
	
	public T getName() {
		return (T) name;
	}
	
	/*public void display() {
		//super.display();
		System.out.println("Cat class: "+getName()+" ");
	}
	public void setAdnDisplay() {
		System.out.println(getName()+"fff");
	}
	*/
}
