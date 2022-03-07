package Polymorphism_practice;

public class Main {

	public static void main(String[] args) {
		SuperWorker first = new PerHourWorker(15,"Ivan","Rudyi");
		SuperWorker second = new MonthWorker(3000, "Darya", "Red");
		SuperWorker third = new PerHourWorker(80, "Viktor", "Kovarniy");
		Company google = new Company("Google");
		google.addWorkerToCompnay(first);
		google.addWorkerToCompnay(second);
		google.addWorkerToCompnay(third);
		google.displayAllInformation();
	}

}
