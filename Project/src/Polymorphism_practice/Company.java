package Polymorphism_practice;

import java.io.FileWriter;
import java.io.IOException;
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
	
	void saveWorkerstoFile(){
		   try(FileWriter writer = new FileWriter("d:\\Workers.txt", false))
	        {
			   String text="";
			   for(SuperWorker i : workers) {
					text+=i.name+" "+i.secondName+" "+i.salary+"\n";
				}
			   writer.append(text);
			   writer.flush();
	        }
	        catch(IOException ex){
	            System.out.println(ex.getMessage());
	        } 
	}
	
	void loadWorkersFromFile() {
		
	}

}
