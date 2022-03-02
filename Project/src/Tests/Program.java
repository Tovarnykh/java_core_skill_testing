package Tests;

public class Program {
	public static void main(String[] args){
		Animal cat = new Animal("Lucy");
		cat.display();
		changeName(cat);
		cat.display();
	}
	private static void changeName(Animal p) {
		p = new Animal("Jucy");
		p.setName("Ju");
	}
}
