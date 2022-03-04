package Inheritance_Practice_Store;

public abstract class Electronics extends Product{
	
	//vars
	int amountOfRAM;
	String memoryType;
	int amountOfCores;
	float coreFrequency;
	
	//
	//methods
	public Electronics(int id, String title, int amount, String description, int cost, int daysleft, int amountOfRAM, String memoryType, int amountOfCores, float coreFrequency) {
		super(id, title, amount, description, cost, daysleft);
		this.amountOfCores = amountOfCores;
		this.memoryType = memoryType;
		this.amountOfCores = amountOfCores;
		this.coreFrequency = coreFrequency;
	}
	//
}
