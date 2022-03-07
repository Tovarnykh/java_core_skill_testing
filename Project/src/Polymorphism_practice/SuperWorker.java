package Polymorphism_practice;

public abstract class SuperWorker {
	int salary;
	String name;
	String secondName;
	abstract int monthSalary();
	
	SuperWorker(int salary, String name, String secondName){
		this.salary=salary;
		this.name=name;
		this.secondName=secondName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	
}
