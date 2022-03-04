package Inheritance_Practice_Store;

public class Computer extends Electronics{

	int numberOfCoresVC;
	float videocardFrequency;
	int videocardMemory;
	
	public Computer(int id, String title, int amount, String description, int cost, int daysleft, int amountOfRAM,
			String memoryType, int amountOfCores, float coreFrequency, int numberOfCoresVC, float videocardFrequency,
			int videocardMemory) {
		super(id, title, amount, description, cost, daysleft, amountOfRAM, memoryType, amountOfCores, coreFrequency);
		this.numberOfCoresVC = numberOfCoresVC;
		this.videocardFrequency = videocardFrequency;
		this.videocardMemory = videocardMemory;
	}
	

}
