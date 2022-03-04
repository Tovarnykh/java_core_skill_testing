package Inheritance_Practice_Store;

public class Smartphone extends Electronics{
	
	String os;
	int diagonal;
	int worktime;

	public Smartphone(int id, String title, int amount, String description, int cost, int daysleft, int amountOfRAM,
			String memoryType, int amountOfCores, float coreFrequency, String os, int diagonal, int worktime) {
			super(id, title, amount, description, cost, daysleft, amountOfRAM, memoryType, amountOfCores, coreFrequency);
			this.os = os;
			this.diagonal = diagonal;
			this.worktime = worktime;
	}
	
}
