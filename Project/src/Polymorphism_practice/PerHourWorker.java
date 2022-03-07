package Polymorphism_practice;

public class PerHourWorker extends SuperWorker{

	public PerHourWorker(int salary, String name, String secondName) {
		super(salary, name, secondName);
		
	}

	@Override
	int monthSalary() {
		return 23*8*salary;
	}
	
}
