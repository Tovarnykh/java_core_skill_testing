package Polymorphism_practice;

public class MonthWorker extends SuperWorker{

	MonthWorker(int salary, String name, String secondName) {
		super(salary, name, secondName);
	}

	@Override
	int monthSalary() {
		return salary;
	}

	
}
