package Polymorphism_practice;

import java.util.ArrayList;

public class Company {
	
	
	
	ArrayList<SuperWorker> workers = new ArrayList<SuperWorker>();
	String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	void addWorkerToCompnay(SuperWorker w) {
		workers.add(w);
	}
	
	int salarySpendings() {
		int spendings=0;
		for(SuperWorker i : workers) {
			spendings += i.monthSalary();
		}
		return spendings;
	}
	
	void displayAllInformation() {
		for(SuperWorker i : workers) {
			System.out.println("Name: "+i.name+i.secondName+"; Salary - "+i.monthSalary());
		}
	}
	
	
	
}
